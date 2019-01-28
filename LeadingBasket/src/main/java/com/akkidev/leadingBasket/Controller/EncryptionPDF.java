package com.akkidev.leadingBasket.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

import org.springframework.stereotype.Service;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class EncryptionPDF {

	public void setPassword(Path fileNameAndPath, String uploadDir, String docName) {
	    PdfReader reader;
	    try {
	      reader = new PdfReader(fileNameAndPath.toString());
	      File f = new File(uploadDir + "/" + docName + ".pdf");
	      FileOutputStream fopne = new FileOutputStream(f);
	      PdfStamper stamper = new PdfStamper(reader, fopne);
	      String USER_PASS = "aakash";
	      String OWNER_PASS = "aakash123";
	      stamper.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(), PdfWriter.ALLOW_PRINTING,
	          PdfWriter.ENCRYPTION_AES_128 | PdfWriter.DO_NOT_ENCRYPT_METADATA);
	      stamper.close();
	      fopne.close();
	      reader.close();
	    } catch (IOException | DocumentException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }

}}
