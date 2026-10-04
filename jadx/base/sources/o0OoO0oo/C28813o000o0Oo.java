package o0OoO0oo;

import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o000o0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$isPenBoxVisible$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28813o000o0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC24338OooO0o0, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f102014OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ AbstractC24338OooO0o0 f102015OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC24338OooO0o0 abstractC24338OooO0o0, Boolean bool, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C28813o000o0Oo c28813o000o0Oo = new C28813o000o0Oo(3, continuation);
        c28813o000o0Oo.f102015OooOo0o = abstractC24338OooO0o0;
        c28813o000o0Oo.f102014OooOo = zBooleanValue;
        return c28813o000o0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = this.f102015OooOo0o;
        boolean z = this.f102014OooOo;
        Boolean bool = (Boolean) abstractC24338OooO0o0.OooO0OO(App.f69581o00000O0);
        return Boolean.valueOf((bool != null ? bool.booleanValue() : true) && !z);
    }
}
