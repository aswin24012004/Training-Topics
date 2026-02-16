package com.qrcode;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRGenerator {
	public static void main(String[] args) throws WriterException, IOException {
		
		String data = "https://www.baeldung.com/java-poet"; 
		String filePath = "D:\\QRCode.png";
		
		QRCodeWriter qr = new QRCodeWriter();
		BitMatrix bitmat = qr.encode(data, BarcodeFormat.QR_CODE, 300, 300);
		
		Path path = FileSystems.getDefault().getPath(filePath);
		MatrixToImageWriter.writeToPath(bitmat, "PNG", path); 
		
		System.out.println("QR Code generated at: " + filePath); 
		}
	}

