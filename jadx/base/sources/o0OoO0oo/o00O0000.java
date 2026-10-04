package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$special$$inlined$flatMapLatest$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class o00O0000 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends NoteMeta>>, List<? extends C28961o00oOoOO>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f102098OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102099OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102100OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f102101OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f102100OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends NoteMeta>> interfaceC33723OooO0oO, List<? extends C28961o00oOoOO> list, Continuation<? super C32460OooOooO> continuation) {
        o00O0000 o00o00002 = new o00O0000(this.f102100OooOoO, continuation);
        o00o00002.f102098OooOo = interfaceC33723OooO0oO;
        o00o00002.f102101OooOoO0 = list;
        return o00o00002.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r8, r7) == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102099OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f102098OooOo;
            List list = (List) this.f102101OooOoO0;
            C27449o00O0OoO c27449o00O0OoO = this.f102100OooOoO.f73350OooO0Oo;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C28961o00oOoOO) it.next()).f102615OooO00o);
            }
            this.f102098OooOo = interfaceC33723OooO0oO;
            this.f102099OooOo0o = 1;
            obj = c27449o00O0OoO.f96036OooO0O0.OooOO0(c27449o00O0OoO.f96037OooO0OO.OooO0Oo(), arrayList);
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
        interfaceC33723OooO0oO = this.f102098OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f102098OooOo = null;
        this.f102099OooOo0o = 2;
    }
}
