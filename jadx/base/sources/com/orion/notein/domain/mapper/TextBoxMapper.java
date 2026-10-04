package com.orion.notein.domain.mapper;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.orion.notein.data.p602db.entity.TextBoxEntity;
import com.orion.notein.domain.models.page.TextBox;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0oo0O.C31218OooO00o;
import o0oo0O.C31219OooO0O0;
import oO00ooO.C32460OooOooO;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34467OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/TextBoxMapper;", "", "<init>", "()V", "Lcom/orion/notein/domain/models/page/TextBox;", "box", "Lcom/orion/notein/data/db/entity/TextBoxEntity;", "toEntity", "(Lcom/orion/notein/domain/models/page/TextBox;)Lcom/orion/notein/data/db/entity/TextBoxEntity;", "entity", "LoO00ooO/OooOooO;", "fillEntity", "(Lcom/orion/notein/domain/models/page/TextBox;Lcom/orion/notein/data/db/entity/TextBoxEntity;)V", "toModel", "(Lcom/orion/notein/data/db/entity/TextBoxEntity;)Lcom/orion/notein/domain/models/page/TextBox;", "info", "fillModel", "(Lcom/orion/notein/data/db/entity/TextBoxEntity;Lcom/orion/notein/domain/models/page/TextBox;)V", "LoOo00O0O/OooO0OO;", "json", "LoOo00O0O/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class TextBoxMapper {
    private final AbstractC34457OooO0OO json = C34467OooOo0.OooO00o(new OooO0o());

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO json$lambda$0(oOo00O0O.OooO0o Json) {
        OooOOO0.OooO0oO(Json, "$this$Json");
        Json.f123498OooO0OO = true;
        return C32460OooOooO.f116667OooO00o;
    }

    public final void fillEntity(TextBox box, TextBoxEntity entity) {
        OooOOO0.OooO0oO(box, "box");
        OooOOO0.OooO0oO(entity, "entity");
        RectF bounds = box.getBounds();
        entity.setBoundsJson(bounds != null ? this.json.OooO00o(C31219OooO0O0.f111342OooO00o, bounds) : null);
        Matrix localTransform = box.getLocalTransform();
        entity.setLocalTransformJson(localTransform != null ? this.json.OooO00o(C31218OooO00o.f111340OooO00o, localTransform) : null);
        if (box.isRegionLoadable()) {
            RectF boundingBox = box.getBoundingBox(1.0f);
            if (boundingBox.isEmpty()) {
                return;
            }
            entity.setLeft(Float.valueOf(boundingBox.left));
            entity.setTop(Float.valueOf(boundingBox.top));
            entity.setRight(Float.valueOf(boundingBox.right));
            entity.setBottom(Float.valueOf(boundingBox.bottom));
        }
    }

    public final void fillModel(TextBoxEntity entity, TextBox info) {
        OooOOO0.OooO0oO(entity, "entity");
        OooOOO0.OooO0oO(info, "info");
        String boundsJson = entity.getBoundsJson();
        info.setBounds(boundsJson != null ? (RectF) this.json.OooO0O0(boundsJson, C31219OooO0O0.f111342OooO00o) : null);
        String localTransformJson = entity.getLocalTransformJson();
        info.setLocalTransform(localTransformJson != null ? (Matrix) this.json.OooO0O0(localTransformJson, C31218OooO00o.f111340OooO00o) : null);
    }

    public abstract TextBoxEntity toEntity(TextBox box);

    public abstract TextBox toModel(TextBoxEntity entity);
}
