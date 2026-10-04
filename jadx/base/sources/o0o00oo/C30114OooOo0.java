package o0o00oo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import o0Oo0o00.C28201OooooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o00oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$initCloudSyncView$1$1", m80623f = "NoteListContainerFragment.kt", m80624l = {874, 879}, m80625m = "invokeSuspend")
public final class C30114OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107216OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107217OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30114OooOo0(NoteListContainerFragment noteListContainerFragment, Continuation<? super C30114OooOo0> continuation) {
        super(2, continuation);
        this.f107216OooOo = noteListContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30114OooOo0(this.f107216OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30114OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r10 == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C30114OooOo0 c30114OooOo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107217OooOo0o;
        NoteListContainerFragment noteListContainerFragment = this.f107216OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f107217OooOo0o = 1;
            c30114OooOo0 = this;
            obj = NoteListContainerFragment.Oooo00o(noteListContainerFragment, 9, 0, null, c30114OooOo0, 6);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Context contextRequireContext = noteListContainerFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(noteListContainerFragment), o0oo000O.OooOO0O.OooO00o(contextRequireContext) ? zBooleanValue ? R.id.cloudSyncDetailsDialogFragment : R.id.cloudSyncLoginDialogFragment : zBooleanValue ? R.id.cloudSyncDetailsBottomSheetFragment : R.id.cloudSyncLoginContainerFragment, null);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        c30114OooOo0 = this;
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        C28201OooooO0 c28201OooooO0 = (C28201OooooO0) noteListContainerFragment.f77341Oooo000.getValue();
        c30114OooOo0.f107217OooOo0o = 2;
        obj = c28201OooooO0.OooO(this);
    }
}
