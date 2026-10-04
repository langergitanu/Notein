package o0OoOoo0;

import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: o0OoOoo0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteViewModel$isLatestOpenedNoteTabVisible$1", m80623f = "LatestOpenedNoteViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29248OooOo0O extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends LatestOpenedNoteVO>, Boolean, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f103719OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f103720OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f103721OooOoO0;

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends LatestOpenedNoteVO> list, Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C29248OooOo0O c29248OooOo0O = new C29248OooOo0O(4, continuation);
        c29248OooOo0O.f103720OooOo0o = list;
        c29248OooOo0O.f103719OooOo = zBooleanValue;
        c29248OooOo0O.f103721OooOoO0 = zBooleanValue2;
        return c29248OooOo0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf((!this.f103721OooOoO0 || this.f103719OooOo || this.f103720OooOo0o.isEmpty()) ? false : true);
    }
}
