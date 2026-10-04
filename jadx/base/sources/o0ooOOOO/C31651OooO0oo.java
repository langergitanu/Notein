package o0ooOOOO;

import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import pdfcpu_mobile.Pdfcpu_mobile;

/* JADX INFO: renamed from: o0ooOOOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.pdfcore.PdfcpuLib$optimize$2", m80623f = "Pdfcpu.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C31651OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ File f113153OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31651OooO0oo(File file, Continuation<? super C31651OooO0oo> continuation) {
        super(2, continuation);
        this.f113153OooOo0o = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31651OooO0oo(this.f113153OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C31651OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Exception {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        if (!((Boolean) C31642OooO.f113102OooO00o.getValue()).booleanValue()) {
            throw new IllegalStateException("Check failed.");
        }
        File file = this.f113153OooOo0o;
        File file2 = new File(file.getParent(), C32501OooO0oO.OooO0o(file).concat("_opt.pdf"));
        Pdfcpu_mobile.optimize(file.getPath(), file2.getPath());
        return file2;
    }
}
