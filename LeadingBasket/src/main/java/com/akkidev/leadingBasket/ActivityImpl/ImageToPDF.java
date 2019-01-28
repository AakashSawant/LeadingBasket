package com.akkidev.leadingBasket.ActivityImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class ImageToPDF {
	public void imgtoPDF(String uploadDir, String docName, String extension) {
	    Document document = new Document();
	    Image image;
	    try {
	      image = Image.getInstance(uploadDir + "/" + docName + "." + extension);
	      int indentation = 0;
	      float scaler = ((document.getPageSize().getWidth() - document.leftMargin()
	          - document.rightMargin() - indentation) / image.getWidth()) * 100;
	      image.scalePercent(scaler);
	      File f = new File(uploadDir + "/" + docName + ".pdf");
	      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(f));
	      String USER_PASS = "aakash";
	      String OWNER_PASS = "aakash123";
	      writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(), PdfWriter.ALLOW_PRINTING,
	          PdfWriter.ENCRYPTION_AES_128);
	      document.open();
	      document.add(image);
	      document.close();
	    } catch (IOException | DocumentException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }

	  }

}
