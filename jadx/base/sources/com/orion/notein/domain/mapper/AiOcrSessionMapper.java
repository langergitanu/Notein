package com.orion.notein.domain.mapper;

import android.net.Uri;
import android.os.Bundle;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.orion.notein.data.p602db.entity.AiOcrSessionEntity;
import com.orion.notein.data.p602db.entity.BundleTypeAdapterFactory;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AiOcrSessionMapper {
    private final Gson gson = new GsonBuilder().registerTypeAdapter(Uri.class, new UriAdapter()).registerTypeAdapterFactory(new BundleTypeAdapterFactory()).create();

    public void fillEntity(AiOcrSession aiOcrSession, AiOcrSessionEntity aiOcrSessionEntity) {
        aiOcrSessionEntity.setInputSourceJson(this.gson.toJson(aiOcrSession.getInputSource()));
    }

    public void fillModel(AiOcrSessionEntity aiOcrSessionEntity, AiOcrSession aiOcrSession) {
        try {
            aiOcrSession.setInputSource((AiOcrSessionInputSource) this.gson.fromJson(aiOcrSessionEntity.getInputSourceJson(), AiOcrSessionInputSource.class));
            if (aiOcrSession.getInputSource().getExtras() == null) {
                aiOcrSession.getInputSource().setExtras(new Bundle());
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "AiOcrSessionMapper", "fillModel: ");
            sbOooO0O0.append(aiOcrSessionEntity.getInputSourceJson());
            c20358OooO00o.OooO0Oo(e, sbOooO0O0.toString(), new Object[0]);
        }
    }

    public abstract AiOcrSession fromEntity(AiOcrSessionEntity aiOcrSessionEntity);

    public abstract AiOcrSessionEntity toEntity(AiOcrSession aiOcrSession);
}
