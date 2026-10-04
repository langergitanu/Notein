package o0OO00o0;

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

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageRepoImpl$getImageFileToBeSaved$2", m80623f = "ImageRepoImpl.kt", m80624l = {178}, m80625m = "invokeSuspend")
public final class o00O0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f91673OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f91674OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f91675OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26596o00O0o0 f91676OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f91677OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Uri f91678OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(C26596o00O0o0 c26596o00O0o0, String str, String str2, Uri uri, Continuation<? super o00O0O0> continuation) {
        super(2, continuation);
        this.f91676OooOoO0 = c26596o00O0o0;
        this.f91675OooOoO = str;
        this.f91677OooOoOO = str2;
        this.f91678OooOoo0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0O0(this.f91676OooOoO0, this.f91675OooOoO, this.f91677OooOoOO, this.f91678OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((o00O0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        File file;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91673OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26596o00O0o0 c26596o00O0o0 = this.f91676OooOoO0;
            File fileOooO = c26596o00O0o0.OooO(this.f91675OooOoO);
            this.f91674OooOo0o = fileOooO;
            this.f91673OooOo = 1;
            obj = c26596o00O0o0.OooOOOo(this.f91677OooOoOO, this.f91678OooOoo0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file = fileOooO;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f91674OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        return new File(file, (String) obj);
    }
}
