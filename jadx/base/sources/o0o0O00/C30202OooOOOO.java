package o0o0O00;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: o0o0O00.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onAddLabel$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {101, 106}, m80625m = "invokeSuspend")
public final class C30202OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30201OooOOO0 f107563OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107564OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107565OooOoO0;

    /* JADX INFO: renamed from: o0o0O00.OooOOOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onAddLabel$1$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30201OooOOO0 f107566OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ NoteVO f107567OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteVO noteVO, Continuation continuation, C30201OooOOO0 c30201OooOOO0) {
            super(2, continuation);
            this.f107567OooOo0o = noteVO;
            this.f107566OooOo = c30201OooOOO0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107567OooOo0o, continuation, this.f107566OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ItemData itemData = this.f107567OooOo0o.getItemData();
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = this.f107566OooOo.f107547OooO00o.requireActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
            ((MainActivity) activityC21897OooOo0RequireActivity).openLabelPicker(new ItemData[]{itemData});
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30202OooOOOO(NoteVO noteVO, Continuation continuation, C30201OooOOO0 c30201OooOOO0) {
        super(2, continuation);
        this.f107563OooOo = c30201OooOOO0;
        this.f107565OooOoO0 = noteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30202OooOOOO(this.f107565OooOoO0, continuation, this.f107563OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30202OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r7, r1, r6) == r0) goto L22;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107564OooOo0o;
        C30201OooOOO0 c30201OooOOO0 = this.f107563OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
            if (oooO != null) {
                oooO.OooO00o();
            }
            this.f107564OooOo0o = 1;
            obj = C30201OooOOO0.OooO00o(c30201OooOOO0, 30, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        OooO00o oooO00o = new OooO00o(this.f107565OooOoO0, null, c30201OooOOO0);
        this.f107564OooOo0o = 2;
    }
}
