package com.google.firebase.vertexai.type;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m80612d2 = {"<anonymous>", "", "invoke"}, m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class GenerateContentResponse$text$2 extends OooOOOO implements OooO00o<String> {
    final /* synthetic */ GenerateContentResponse this$0;

    /* JADX INFO: renamed from: com.google.firebase.vertexai.type.GenerateContentResponse$text$2$1 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/TextPart;", TranslateLanguage.ITALIAN, "", "invoke", "(Lcom/google/firebase/vertexai/type/TextPart;)Ljava/lang/CharSequence;", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C172611 extends OooOOOO implements InterfaceC32507OooOO0o<TextPart, CharSequence> {
        public static final C172611 INSTANCE = new C172611();

        public C172611() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final CharSequence invoke(TextPart it) {
            OooOOO0.OooO0oO(it, "it");
            return it.getText();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateContentResponse$text$2(GenerateContentResponse generateContentResponse) {
        super(0);
        this.this$0 = generateContentResponse;
    }

    @Override // oO0O000o.OooO00o
    public final String invoke() {
        List<Part> parts = ((Candidate) OooOo.Oooo0oO(this.this$0.getCandidates())).getContent().getParts();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parts) {
            if (obj instanceof TextPart) {
                arrayList.add(obj);
            }
        }
        return OooOo.o000oOoO(arrayList, " ", null, null, C172611.INSTANCE, 30);
    }
}
