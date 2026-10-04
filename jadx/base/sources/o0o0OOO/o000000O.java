package o0o0OOO;

import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.io.Serializable;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31041OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32512OooOo0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$selectedPaperTheme$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000000O extends AbstractC32476OooO implements InterfaceC32512OooOo0<PaperTheme, Map<Integer, ? extends Integer>, PaperOrientation, String, C31041OooOOO, Boolean, Continuation<? super PaperTheme>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ PaperOrientation f108990OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ PaperTheme f108991OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ C31041OooOOO f108992OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f108993OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ boolean f108994OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108995OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(Continuation continuation, C30520o000000o c30520o000000o) {
        super(7, continuation);
        this.f108995OooOoo0 = c30520o000000o;
    }

    @Override // oO0O000o.InterfaceC32512OooOo0
    public final Object OoooO0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        o000000O o000000o2 = new o000000O((Continuation) serializable, this.f108995OooOoo0);
        o000000o2.f108991OooOo0o = (PaperTheme) obj;
        o000000o2.f108990OooOo = (PaperOrientation) obj3;
        o000000o2.f108993OooOoO0 = (String) obj4;
        o000000o2.f108992OooOoO = (C31041OooOOO) obj5;
        o000000o2.f108994OooOoOO = zBooleanValue;
        return o000000o2.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        PaperTheme paperTheme = this.f108991OooOo0o;
        PaperOrientation paperOrientation = this.f108990OooOo;
        String str = this.f108993OooOoO0;
        C31041OooOOO c31041OooOOO = this.f108992OooOoO;
        boolean z = this.f108994OooOoOO;
        if (paperTheme == null) {
            return null;
        }
        Object obj2 = C30520o000000o.f108997ooOO;
        C30520o000000o c30520o000000o = this.f108995OooOoo0;
        c30520o000000o.getClass();
        return c30520o000000o.OooOO0(paperTheme, C30520o000000o.OooOOo(str), paperOrientation, c31041OooOOO, z);
    }
}
