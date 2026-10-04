package o0OoO0oo;

import android.database.sqlite.SQLiteConstraintException;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o00oo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$setZoom$1", m80623f = "NoteEditorViewModel.kt", m80624l = {438, 443}, m80625m = "invokeSuspend")
public final class C28967o00oo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102630OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102631OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f102632OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28967o00oo000(C23344OooOOo c23344OooOOo, float f, Continuation<? super C28967o00oo000> continuation) {
        super(2, continuation);
        this.f102630OooOo = c23344OooOOo;
        this.f102632OooOoO0 = f;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28967o00oo000(this.f102630OooOo, this.f102632OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28967o00oo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r7 == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102631OooOo0o;
        C23344OooOOo c23344OooOOo = this.f102630OooOo;
        C27449o00O0OoO c27449o00O0OoO = c23344OooOOo.f73545OooO0Oo;
        try {
        } catch (SQLiteConstraintException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorViewModel");
            c20358OooO00o.OooO0Oo(e, "update note zoom failed.", new Object[0]);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = (String) c23344OooOOo.f73588OoooOOO.getValue();
            this.f102631OooOo0o = 1;
            obj = c27449o00O0OoO.OooOoO0(str, this);
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
        NoteContent noteContent = (NoteContent) obj;
        if (noteContent == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) c23344OooOOo.f73606o00o0O.f121747OooOo0o.getValue();
        float f = this.f102632OooOoO0;
        if (c28694OooOO0O != null) {
            c28694OooOO0O.f101672OooO0o0 = f;
        }
        this.f102631OooOo0o = 2;
        Object objOooO0o0 = c27449o00O0OoO.f96035OooO00o.OooO0o0(noteContent.getId(), f, this);
        if (objOooO0o0 != enumC32485OooO00o) {
            objOooO0o0 = C32460OooOooO.f116667OooO00o;
        }
    }
}
