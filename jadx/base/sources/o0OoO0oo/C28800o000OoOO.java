package o0OoO0oo;

import com.orion.notein.domain.models.note.Outline;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o000OoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$getAllDescendantOutlines$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {863, 868}, m80625m = "invokeSuspend")
public final class C28800o000OoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<Outline>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f101979OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f101980OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f101981OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101982OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28800o000OoOO(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str, Continuation<? super C28800o000OoOO> continuation) {
        super(2, continuation);
        this.f101982OooOoO0 = oooO0OO;
        this.f101981OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28800o000OoOO(this.f101982OooOoO0, this.f101981OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<Outline>> continuation) {
        return ((C28800o000OoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101979OooOo;
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f101982OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String strOooOO0O = oooO0OO.OooOO0O();
            this.f101979OooOo = 1;
            obj = oooO0OO.f73357OooOO0o.OooO0O0(this.f101981OooOoO, strOooOO0O, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArrayList arrayList = this.f101980OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return arrayList;
        }
        C32446OooOOOo.OooO0O0(obj);
        Outline outline = (Outline) obj;
        ArrayList arrayList2 = new ArrayList();
        if (outline != null) {
            this.f101980OooOo0o = arrayList2;
            this.f101979OooOo = 2;
            if (oooO0OO.OooO0oo(outline, arrayList2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return arrayList2;
    }
}
