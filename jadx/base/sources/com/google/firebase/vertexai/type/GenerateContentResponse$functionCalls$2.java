package com.google.firebase.vertexai.type;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m80612d2 = {"<anonymous>", "", "Lcom/google/firebase/vertexai/type/FunctionCallPart;", "invoke"}, m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class GenerateContentResponse$functionCalls$2 extends OooOOOO implements OooO00o<List<? extends FunctionCallPart>> {
    final /* synthetic */ GenerateContentResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateContentResponse$functionCalls$2(GenerateContentResponse generateContentResponse) {
        super(0);
        this.this$0 = generateContentResponse;
    }

    @Override // oO0O000o.OooO00o
    public final List<? extends FunctionCallPart> invoke() {
        List<Part> parts = ((Candidate) OooOo.Oooo0oO(this.this$0.getCandidates())).getContent().getParts();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parts) {
            if (obj instanceof FunctionCallPart) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
