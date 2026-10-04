package o0Oo00o;

import com.google.gson.GsonBuilder;
import com.orion.notein.domain.mapper.RuntimeTypeAdapterFactory;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0Oo00o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28029OooO0o0 implements oO0O000o.OooO00o {
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        return new GsonBuilder().registerTypeAdapterFactory(RuntimeTypeAdapterFactory.m80562of(InterfaceC31284OooO0O0.class, "displayItemType").registerSubtype(DrawRecord.class, "DrawRecord").registerSubtype(ImageInfo.class, "ImageInfo").registerSubtype(TextBoxInfo.class, "TextBoxInfo").registerSubtype(ShapeInfo.class, "ShapeInfo")).disableHtmlEscaping().create();
    }
}
