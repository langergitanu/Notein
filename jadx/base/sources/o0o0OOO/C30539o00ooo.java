package o0o0OOO;

import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import o0o0OOOo.EnumC30546OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32513OooOo0O;

/* JADX INFO: renamed from: o0o0OOO.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$isConfirmButtonEnabled$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30539o00ooo extends AbstractC32476OooO implements InterfaceC32513OooOo0O<Integer, PaperTheme, PaperTheme, MyTemplate, EnumC30546OooO0O0, PaperTheme, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109194OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f109195OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ MyTemplate f109196OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109197OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ EnumC30546OooO0O0 f109198OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ boolean f109199OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109200OooOoo0;

    public C30539o00ooo(Continuation<? super C30539o00ooo> continuation) {
        super(8, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f109195OooOo0o;
        PaperTheme paperTheme = this.f109194OooOo;
        PaperTheme paperTheme2 = this.f109197OooOoO0;
        MyTemplate myTemplate = this.f109196OooOoO;
        EnumC30546OooO0O0 enumC30546OooO0O0 = this.f109198OooOoOO;
        PaperTheme paperTheme3 = this.f109200OooOoo0;
        if (this.f109199OooOoo) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (paperTheme3 != null) {
            if (i == 0) {
                int iOrdinal = enumC30546OooO0O0.ordinal();
                if (iOrdinal == 0) {
                    paperTheme = paperTheme2;
                } else if (iOrdinal != 1) {
                    throw new C32442OooOO0o();
                }
                if (paperTheme != null && !paperTheme.equals(paperTheme3)) {
                }
            } else if (i == 1) {
                if ((myTemplate != null ? myTemplate.getPaperTheme() : null) != null && !kotlin.jvm.internal.OooOOO0.OooO0O0(myTemplate.getPaperTheme(), paperTheme3)) {
                    z = true;
                }
            }
        } else if (i == 0 ? paperTheme != null : !(i != 1 || myTemplate == null || myTemplate.getId().length() <= 0)) {
        }
        return Boolean.valueOf(z);
    }

    @Override // oO0O000o.InterfaceC32513OooOo0O
    public final Object o0Oo0oo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj7).booleanValue();
        C30539o00ooo c30539o00ooo = new C30539o00ooo((Continuation) serializable);
        c30539o00ooo.f109195OooOo0o = iIntValue;
        c30539o00ooo.f109194OooOo = (PaperTheme) obj2;
        c30539o00ooo.f109197OooOoO0 = (PaperTheme) obj3;
        c30539o00ooo.f109196OooOoO = (MyTemplate) obj4;
        c30539o00ooo.f109198OooOoOO = (EnumC30546OooO0O0) obj5;
        c30539o00ooo.f109200OooOoo0 = (PaperTheme) obj6;
        c30539o00ooo.f109199OooOoo = zBooleanValue;
        return c30539o00ooo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
