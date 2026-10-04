package o0OOo0o;

import com.huawei.hms.network.embedded.C18250l0;
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
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o0000oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase$clearExpiredNoteInFiles$2", m80623f = "NoteInFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27393o0000oO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f95489OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95490OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27393o0000oO0(C27387o0000o0 c27387o0000o0, boolean z, Continuation<? super C27393o0000oO0> continuation) {
        super(2, continuation);
        this.f95490OooOo0o = c27387o0000o0;
        this.f95489OooOo = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27393o0000oO0(this.f95490OooOo0o, this.f95489OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27393o0000oO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        final boolean z = this.f95489OooOo;
        final C27387o0000o0 c27387o0000o0 = this.f95490OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        try {
            new oO0O000o.OooO00o() { // from class: o0OOo0o.o0000o0o
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    File file = new File(c27387o0000o0.f95452OooOoo0.getFilesDir(), "notein_files");
                    if (file.exists()) {
                        File file2 = new File(file, "export");
                        if (file2.exists()) {
                            long j = z ? C18250l0.g.f55491e : C18250l0.g.f55493g;
                            File[] fileArrListFiles = file2.listFiles();
                            if (fileArrListFiles != null) {
                                for (File file3 : fileArrListFiles) {
                                    File[] fileArrListFiles2 = file3.listFiles();
                                    if (fileArrListFiles2 != null) {
                                        for (File file4 : fileArrListFiles2) {
                                            if (System.currentTimeMillis() - file4.lastModified() > j) {
                                                C31190OooO0oo.OooO0oo(file4);
                                            }
                                        }
                                    }
                                    File[] fileArrListFiles3 = file3.listFiles();
                                    if ((fileArrListFiles3 != null ? oOo000Oo.OooOOO.OoooOO0(fileArrListFiles3) : C34434OooOoO.f123453OooOo0o).isEmpty() && System.currentTimeMillis() - file3.lastModified() > j) {
                                        C32501OooO0oO.OooO0Oo(file3);
                                    }
                                }
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }.invoke();
            new oO0O000o.OooO00o() { // from class: o0OOo0o.o0000o
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    File file = new File(c27387o0000o0.f95452OooOoo0.getFilesDir(), "notein_files");
                    if (file.exists()) {
                        File file2 = new File(file, "import");
                        if (file2.exists()) {
                            long j = z ? C18250l0.g.f55491e : 1800000L;
                            File[] fileArrListFiles = file2.listFiles();
                            if (fileArrListFiles != null) {
                                for (File file3 : fileArrListFiles) {
                                    if (System.currentTimeMillis() - file3.lastModified() > j) {
                                        C31190OooO0oo.OooO0oo(file3);
                                    }
                                }
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }.invoke();
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0Oo(e, "clearExpiredNoteInFiles error.", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
