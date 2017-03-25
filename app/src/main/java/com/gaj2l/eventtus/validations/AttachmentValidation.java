package com.gaj2l.eventtus.validations;

import com.gaj2l.eventtus.lib.Validation;
import com.gaj2l.eventtus.models.Attachment;

/**
 * Created by Jackson Majolo on 24/03/2017.
 */

public class AttachmentValidation extends Validation<Attachment> {

    @Override
    public void validate(Attachment attachment) throws Exception{

        if(attachment.getName() == null || attachment.getName().equals("")){
            throw new Exception();
        }

        if(attachment.getLocal() == null || attachment.getName().equals("")){
            throw new Exception();
        }

        if(attachment.getActivity() == null ){
            throw new Exception();
        }

        if(attachment.getTypeAttachment() == null ){
            throw new Exception();
        }
    }
}