package o0OO0O0;

import java.io.File;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0O0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioRepoImpl$duplicatedAudioFileToPrivate$2", m80623f = "AudioRepoImpl.kt", m80624l = {165}, m80625m = "invokeSuspend")
public final class C26703OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f92247OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92248OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f92249OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92250OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ File f92251OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26703OooOo0(Oooo000 oooo000, String str, String str2, File file, Continuation<? super C26703OooOo0> continuation) {
        super(2, continuation);
        this.f92247OooOo = oooo000;
        this.f92250OooOoO0 = str;
        this.f92249OooOoO = str2;
        this.f92251OooOoOO = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26703OooOo0(this.f92247OooOo, this.f92250OooOoO0, this.f92249OooOoO, this.f92251OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C26703OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92248OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f92248OooOo0o = 1;
            obj = this.f92247OooOo.OooOOOo(this.f92250OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        File file = this.f92251OooOoOO;
        File file2 = new File((File) obj, com.aspose.slides.OooOOO.OooO0O0(new StringBuilder(), this.f92249OooOoO, ".", C32501OooO0oO.OooO0o0(file)));
        C31190OooO0oo.OooO00o(file, file2);
        return file2.getAbsolutePath();
    }
}
