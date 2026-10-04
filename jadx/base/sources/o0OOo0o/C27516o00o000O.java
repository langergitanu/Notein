package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00o000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ShortcutValidationUseCase$validateFolderExists$2", m80623f = "ShortcutValidationUseCase.kt", m80624l = {66}, m80625m = "invokeSuspend")
public final class C27516o00o000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f96434OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96435OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oo00oO f96436OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27516o00o000O(String str, oo00oO oo00oo, Continuation<? super C27516o00o000O> continuation) {
        super(2, continuation);
        this.f96434OooOo = str;
        this.f96436OooOoO0 = oo00oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27516o00o000O(this.f96434OooOo, this.f96436OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27516o00o000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96435OooOo0o;
        String str = this.f96434OooOo;
        boolean z = true;
        boolean z2 = false;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (C33599OooOo0O.Oooo0o0(str)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("ShortcutValidationUseCase");
                    c20358OooO00o.OooOO0O("Folder ID is blank", new Object[0]);
                    return Boolean.FALSE;
                }
                C27600o0ooOO0 c27600o0ooOO0 = this.f96436OooOoO0.f97024OooO0O0;
                this.f96435OooOo0o = 1;
                obj = c27600o0ooOO0.OooO0Oo(str, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Folder folder = (Folder) obj;
            if (folder == null || folder.getInTrashBin()) {
                z = false;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("ShortcutValidationUseCase");
            c20358OooO00o2.OooO00o("Folder validation result for " + str + ": " + z, new Object[0]);
            z2 = z;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooO0Oo(e, androidx.core.app.OooO.OooO0O0(c20358OooO00o3, "ShortcutValidationUseCase", "Error validating folder existence: ", str), new Object[0]);
        }
        return Boolean.valueOf(z2);
    }
}
