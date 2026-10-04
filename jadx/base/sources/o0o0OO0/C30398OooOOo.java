package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrSession;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OO0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$getLatestSessionByNoteId$2", m80623f = "AiOcrViewModel.kt", m80624l = {774}, m80625m = "invokeSuspend")
public final class C30398OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AiOcrSession>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108547OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108548OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f108549OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108550OooOoO0;

    /* JADX INFO: renamed from: o0o0OO0.OooOOo$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((AiOcrSession) t2).getLastModificationTime()), Long.valueOf(((AiOcrSession) t).getLastModificationTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30398OooOOo(C30394OooOOOO c30394OooOOOO, String str, String str2, Continuation<? super C30398OooOOo> continuation) {
        super(2, continuation);
        this.f108547OooOo = c30394OooOOOO;
        this.f108550OooOoO0 = str;
        this.f108549OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30398OooOOo(this.f108547OooOo, this.f108550OooOoO0, this.f108549OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AiOcrSession> continuation) {
        return ((C30398OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108548OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30394OooOOOO c30394OooOOOO = this.f108547OooOo;
            this.f108548OooOo0o = 1;
            obj = c30394OooOOOO.f108495OooO0o0.OooO0oO(this.f108550OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (((AiOcrSession) obj2).getInputSource().getSourceUris().contains(this.f108549OooOoO)) {
                arrayList.add(obj2);
            }
        }
        return oOo000Oo.OooOo.Oooo(oOo000Oo.OooOo.o00O0O(arrayList, new OooO00o()));
    }
}
