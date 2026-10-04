package o0OO00o0;

import java.io.File;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageRepoImpl$duplicatedImageFileToPrivate$2", m80623f = "ImageRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91634OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26596o00O0o0 f91635OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ File f91636OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91637OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(C26596o00O0o0 c26596o00O0o0, String str, String str2, File file, Continuation<? super o00O0> continuation) {
        super(2, continuation);
        this.f91635OooOo0o = c26596o00O0o0;
        this.f91634OooOo = str;
        this.f91637OooOoO0 = str2;
        this.f91636OooOoO = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0(this.f91635OooOo0o, this.f91634OooOo, this.f91637OooOoO0, this.f91636OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((o00O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        File file = this.f91636OooOoO;
        String name = file.getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
        boolean zOooOOo0 = C33595OooOOo.OooOOo0(name, ".svg", false);
        File fileOooOO0 = this.f91635OooOo0o.OooOO0(this.f91634OooOo, this.f91637OooOoO0, zOooOOo0);
        C31190OooO0oo.OooO00o(file, fileOooOO0);
        return fileOooOO0.getAbsolutePath();
    }
}
