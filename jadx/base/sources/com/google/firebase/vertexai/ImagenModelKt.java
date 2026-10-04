package com.google.firebase.vertexai;

import com.google.firebase.vertexai.common.ContentBlockedException;
import com.google.firebase.vertexai.type.ImagenGenerationResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, m80612d2 = {"validate", "Lcom/google/firebase/vertexai/type/ImagenGenerationResponse$Internal;", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ImagenGenerationResponse.Internal validate(ImagenGenerationResponse.Internal internal) {
        List<ImagenGenerationResponse.ImagenImageResponse> predictions = internal.getPredictions();
        if (!(predictions instanceof Collection) || !predictions.isEmpty()) {
            Iterator<T> it = predictions.iterator();
            while (it.hasNext()) {
                if (((ImagenGenerationResponse.ImagenImageResponse) it.next()).getMimeType() != null) {
                    return internal;
                }
            }
        }
        for (ImagenGenerationResponse.ImagenImageResponse imagenImageResponse : internal.getPredictions()) {
            if (imagenImageResponse.getRaiFilteredReason() != null) {
                String raiFilteredReason = imagenImageResponse.getRaiFilteredReason();
                if (raiFilteredReason == null) {
                    raiFilteredReason = ImagenModel.DEFAULT_FILTERED_ERROR;
                }
                throw new ContentBlockedException(raiFilteredReason, null, 2, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
