package com.google.firebase.vertexai;

import android.graphics.Bitmap;
import com.google.firebase.vertexai.type.Content;
import com.google.firebase.vertexai.type.InlineDataPart;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Content$Builder;", "LoO00ooO/OooOooO;", "invoke", "(Lcom/google/firebase/vertexai/type/Content$Builder;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class Chat$sendMessageStream$2$content$1 extends OooOOOO implements InterfaceC32507OooOO0o<Content.Builder, C32460OooOooO> {
    final /* synthetic */ LinkedList<Bitmap> $bitmaps;
    final /* synthetic */ LinkedList<InlineDataPart> $inlineDataParts;
    final /* synthetic */ StringBuilder $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Chat$sendMessageStream$2$content$1(LinkedList<Bitmap> linkedList, LinkedList<InlineDataPart> linkedList2, StringBuilder sb) {
        super(1);
        this.$bitmaps = linkedList;
        this.$inlineDataParts = linkedList2;
        this.$text = sb;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public /* bridge */ /* synthetic */ C32460OooOooO invoke(Content.Builder builder) {
        invoke2(builder);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Content.Builder content) {
        OooOOO0.OooO0oO(content, "$this$content");
        for (Bitmap bitmap : this.$bitmaps) {
            OooOOO0.OooO0o(bitmap, "bitmap");
            content.addImage(bitmap);
        }
        for (InlineDataPart inlineDataPart : this.$inlineDataParts) {
            content.addInlineData(inlineDataPart.getInlineData(), inlineDataPart.getMimeType());
        }
        if (C33599OooOo0O.Oooo0o0(this.$text)) {
            return;
        }
        String string = this.$text.toString();
        OooOOO0.OooO0o(string, "text.toString()");
        content.addText(string);
    }
}
