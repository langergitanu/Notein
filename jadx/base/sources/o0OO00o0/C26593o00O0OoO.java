package o0OO00o0;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO00o0.o00O0OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageRepoImpl$saveBitmapToPath$2", m80623f = "ImageRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26593o00O0OoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Bitmap f91711OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f91712OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26593o00O0OoO(String str, Bitmap bitmap, Continuation<? super C26593o00O0OoO> continuation) {
        super(2, continuation);
        this.f91712OooOo0o = str;
        this.f91711OooOo = bitmap;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26593o00O0OoO(this.f91712OooOo0o, this.f91711OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C26593o00O0OoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f91712OooOo0o;
        C31190OooO0oo.OooO0oO(C31190OooO0oo.OooOOO0(str));
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        try {
            try {
                try {
                    this.f91711OooOo.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    fileOutputStream.close();
                    z = true;
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
                fileOutputStream.close();
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }
}
