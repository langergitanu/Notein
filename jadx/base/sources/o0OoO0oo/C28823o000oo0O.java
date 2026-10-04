package o0OoO0oo;

import android.graphics.PointF;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0OoO0oo.o000oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$openNoteInSplitScreen$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28823o000oo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f102041OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102042OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ PointF f102043OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f102044OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f102045OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ boolean f102046OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f102047OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28823o000oo0O(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str, String str2, PointF pointF, String str3, int i, boolean z, Continuation<? super C28823o000oo0O> continuation) {
        super(2, continuation);
        this.f102042OooOo0o = oooO0OO;
        this.f102041OooOo = str;
        this.f102044OooOoO0 = str2;
        this.f102043OooOoO = pointF;
        this.f102045OooOoOO = str3;
        this.f102047OooOoo0 = i;
        this.f102046OooOoo = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28823o000oo0O(this.f102042OooOo0o, this.f102041OooOo, this.f102044OooOoO0, this.f102043OooOoO, this.f102045OooOoOO, this.f102047OooOoo0, this.f102046OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28823o000oo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f102042OooOo0o;
        List list = (List) oooO0OO.f73389OoooO0.getValue();
        ArrayList arrayListOooOO0o = this.f102042OooOo0o.OooOO0o(list, this.f102041OooOo, this.f102044OooOoO0, this.f102043OooOoO, this.f102045OooOoOO);
        int iIntValue = ((Number) ((C32443OooOOO) oooO0OO.f73386Oooo0oO.getValue()).f116638OooOo0o).intValue();
        boolean zEquals = arrayListOooOO0o.equals(list);
        int i = this.f102047OooOoo0;
        if (zEquals && iIntValue == i) {
            Log.d("dual-link", "openNoteInSplitScreen new == old return");
            return C32460OooOooO.f116667OooO00o;
        }
        Log.d("dual-link", "openNoteInSplitScreen new != old");
        Boolean boolValueOf = Boolean.valueOf(this.f102046OooOoo);
        C33781o00o0O c33781o00o0O = oooO0OO.f73391OoooO0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, boolValueOf);
        C33781o00o0O c33781o00o0O2 = oooO0OO.f73389OoooO0;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, arrayListOooOO0o);
        oooO0OO.Oooo0OO(i, null);
        oooO0OO.OoooO(this.f102041OooOo);
        return C32460OooOooO.f116667OooO00o;
    }
}
