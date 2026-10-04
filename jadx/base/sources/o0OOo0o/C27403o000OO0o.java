package o0OOo0o;

import java.io.File;
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

/* JADX INFO: renamed from: o0OOo0o.o000OO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$getTempCacheFile$2", m80623f = "NoteInFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27403o000OO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f95621OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95622OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27403o000OO0o(C27387o0000o0 c27387o0000o0, String str, Continuation<? super C27403o000OO0o> continuation) {
        super(2, continuation);
        this.f95622OooOo0o = c27387o0000o0;
        this.f95621OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27403o000OO0o(this.f95622OooOo0o, this.f95621OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C27403o000OO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        File file = new File(this.f95622OooOo0o.f95452OooOoo0.getCacheDir(), "temp_in_files");
        C31190OooO0oo.OooO0o(file);
        File file2 = new File(file, this.f95621OooOo);
        file2.delete();
        file2.createNewFile();
        return file2;
    }
}
