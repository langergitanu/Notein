package o0o0OO0;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OO0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$saveSessionImage$2", m80623f = "AiOcrViewModel.kt", m80624l = {632}, m80625m = "invokeSuspend")
public final class C30403OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108572OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108573OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Uri f108574OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f108575OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30403OooOo0O(C30394OooOOOO c30394OooOOOO, String str, Uri uri, Continuation<? super C30403OooOo0O> continuation) {
        super(2, continuation);
        this.f108572OooOo = c30394OooOOOO;
        this.f108575OooOoO0 = str;
        this.f108574OooOoO = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30403OooOo0O(this.f108572OooOo, this.f108575OooOoO0, this.f108574OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C30403OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108573OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C30394OooOOOO c30394OooOOOO = this.f108572OooOo;
        this.f108573OooOo0o = 1;
        Object objOooO0OO = c30394OooOOOO.f108495OooO0o0.OooO0OO(this.f108575OooOoO0, this.f108574OooOoO, this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
