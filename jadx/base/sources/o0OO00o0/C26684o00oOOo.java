package o0OO00o0;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO00o0.o00oOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageRepoImpl$saveSVGToPath$2", m80623f = "ImageRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26684o00oOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f92090OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26596o00O0o0 f92091OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92092OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26684o00oOOo(C26596o00O0o0 c26596o00O0o0, Uri uri, String str, Continuation<? super C26684o00oOOo> continuation) {
        super(2, continuation);
        this.f92091OooOo0o = c26596o00O0o0;
        this.f92090OooOo = uri;
        this.f92092OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26684o00oOOo(this.f92091OooOo0o, this.f92090OooOo, this.f92092OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C26684o00oOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(C31190OooO0oo.OooO0O0(this.f92091OooOo0o.f91722OooO0OO, this.f92090OooOo, new File(this.f92092OooOoO0)));
    }
}
