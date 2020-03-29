package com.gym.Certifications.component;

import org.springframework.stereotype.Component;

import com.gym.Certifications.entity.Images;
import com.gym.Certifications.model.ImagesModel;

@Component("imagesConverter")
public class ImagesConverter {
	
	public Images convert2ImagesModel2Images(ImagesModel imagesModel) {
		Images images = new Images();
		images.setClave_exam(imagesModel.clave_exam);
		images.setNumber_question(imagesModel.number_question);
		return images;
	}
	
	public ImagesModel convertImages2Images2Model(Images images) {
		ImagesModel imagesModel = new ImagesModel();
		imagesModel.setClave_exam(images.clave_exam);
		imagesModel.setNumber_question(images.number_question);
		return imagesModel;
	}

}
