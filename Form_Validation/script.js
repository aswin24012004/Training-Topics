const form = document.getElementById('myForm');
    const nameInput = document.getElementById('name');
    const emailInput = document.getElementById('email');
    const phoneInput = document.getElementById('phone');
    const passwordInput = document.getElementById('password');
    const confirmPasswordInput = document.getElementById('confirmPassword');
    const agreeCheckbox = document.getElementById('agree');
    const successMessage = document.getElementById('successMessage');

    // Handle form submission
    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent default form submission
        
        // Reset all error messages
        clearAllErrors();

        // Validate each field
        let isValid = true;

        // Check Name
        if (nameInput.value.trim() === '') {
            showError(nameInput);
            isValid = false;
        }

        // Check Email
        if (emailInput.value.trim() === '') {
            showError(emailInput);
            isValid = false;
        }

        // Check Phone
        if (phoneInput.value.trim() === '') {
            showError(phoneInput);
            isValid = false;
        }

        // Check Password
        if (passwordInput.value.trim() === '') {
            showError(passwordInput);
            isValid = false;
        }

        // Check Confirm Password
        if (confirmPasswordInput.value.trim() === '') {
            showError(confirmPasswordInput);
            isValid = false;
        }

        // Check if passwords match
        if (passwordInput.value !== confirmPasswordInput.value && passwordInput.value.trim() !== '') {
            document.getElementById('confirmError').textContent = 'Passwords do not match';
            confirmPasswordInput.closest('.form-group').classList.add('error');
            isValid = false;
        }

        // Check Agree checkbox
        if (!agreeCheckbox.checked) {
            document.getElementById('agreeError').style.display = 'block';
            isValid = false;
        } else {
            document.getElementById('agreeError').style.display = 'none';
        }

        // If all fields are valid, show success message
        if (isValid) {
            showSuccess();
            form.reset(); // Clear form
        }
    });

    // Function to show error
    function showError(input) {
        const formGroup = input.closest('.form-group');
        formGroup.classList.add('error');
    }

    // Function to clear all errors
    function clearAllErrors() {
        document.querySelectorAll('.form-group').forEach(group => {
            group.classList.remove('error');
        });
        document.getElementById('agreeError').style.display = 'none';
    }

    // Function to show success message
    function showSuccess() {
        successMessage.classList.add('show');
        
        // Hide success message after 3 seconds
        setTimeout(() => {
            successMessage.classList.remove('show');
        }, 3000);
    }

    // Reset error message when user starts typing
    const inputs = [nameInput, emailInput, phoneInput, passwordInput, confirmPasswordInput];
    inputs.forEach(input => {
        input.addEventListener('input', function() {
            const formGroup = this.closest('.form-group');
            if (formGroup.classList.contains('error')) {
                formGroup.classList.remove('error');
            }
        });
    });

    // Reset agree error when checkbox is clicked
    agreeCheckbox.addEventListener('change', function() {
        if (this.checked) {
            document.getElementById('agreeError').style.display = 'none';
        }
    });