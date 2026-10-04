package o0OOoOo0;

import com.orion.notein.domain.models.LabelRef;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.o000O00;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOoOo0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.label.GetItemsByLabelUseCase$findPagesByLabelColor$$inlined$flatMapLatest$2", m80623f = "GetItemsByLabelUseCase.kt", m80624l = {201, 189}, m80625m = "invokeSuspend")
public final class C27818OooOoOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends Page>>, List<? extends LabelRef>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f98260OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98261OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27819OooOoo f98262OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98263OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f98264OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f98265OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Iterator f98266OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27818OooOoOO(Continuation continuation, C27819OooOoo c27819OooOoo, String str) {
        super(3, continuation);
        this.f98262OooOoO = c27819OooOoo;
        this.f98264OooOoOO = str;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, List<? extends LabelRef> list, Continuation<? super C32460OooOooO> continuation) {
        C27818OooOoOO c27818OooOoOO = new C27818OooOoOO(continuation, this.f98262OooOoO, this.f98264OooOoOO);
        c27818OooOoOO.f98260OooOo = interfaceC33723OooO0oO;
        c27818OooOoOO.f98263OooOoO0 = list;
        return c27818OooOoOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r7, r12, r11) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0096 -> B:21:0x0099). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        Collection collection;
        boolean zHasNext;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98261OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f98260OooOo;
            List<LabelRef> list = (List) this.f98263OooOoO0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (LabelRef labelRef : list) {
                arrayList.add(new C32443OooOOO(labelRef.getItemId(), labelRef.getExtraInfo()));
            }
            ArrayList arrayList2 = new ArrayList();
            it = arrayList.iterator();
            interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
            collection = arrayList2;
            zHasNext = it.hasNext();
            C27819OooOoo c27819OooOoo = this.f98262OooOoO;
            if (zHasNext) {
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
        Object obj2 = this.f98265OooOoo;
        it = this.f98266OooOoo0;
        collection = (Collection) this.f98263OooOoO0;
        interfaceC33723OooO0oO = this.f98260OooOo;
        C32446OooOOOo.OooO0O0(obj);
        if (((NoteMeta) obj) == null ? !r12.getInTrashBin() : false) {
            collection.add(obj2);
        }
        zHasNext = it.hasNext();
        C27819OooOoo c27819OooOoo2 = this.f98262OooOoO;
        if (zHasNext) {
            Object next = it.next();
            o000O00 o000o00OooO0O0 = c27819OooOoo2.f98268OooO0O0.OooO0O0((String) ((C32443OooOOO) next).f116637OooOo, this.f98264OooOoOO);
            this.f98260OooOo = interfaceC33723OooO0oO;
            this.f98263OooOoO0 = collection;
            this.f98266OooOoo0 = it;
            this.f98265OooOoo = next;
            this.f98261OooOo0o = 1;
            Object objOooOo00 = C25252OooO0Oo.OooOo00(o000o00OooO0O0, this);
            if (objOooOo00 != enumC32485OooO00o) {
                obj2 = next;
                obj = objOooOo00;
                if (((NoteMeta) obj) == null ? !r12.getInTrashBin() : false) {
                }
                zHasNext = it.hasNext();
                C27819OooOoo c27819OooOoo22 = this.f98262OooOoO;
                if (zHasNext) {
                    List<C32443OooOOO> listOooo0 = oOo000Oo.OooOo.Oooo0((List) collection);
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(listOooo0, 10));
                    for (C32443OooOOO c32443OooOOO : listOooo0) {
                        arrayList3.add(c27819OooOoo22.f98270OooO0Oo.OooO0OO((String) c32443OooOOO.f116638OooOo0o, (String) c32443OooOOO.f116637OooOo));
                    }
                    InterfaceC33721OooO0o interfaceC33721OooO0oOooO00o = C27819OooOoo.OooO00o(c27819OooOoo22, arrayList3);
                    this.f98260OooOo = null;
                    this.f98263OooOoO0 = null;
                    this.f98266OooOoo0 = null;
                    this.f98265OooOoo = null;
                    this.f98261OooOo0o = 2;
                }
            }
        }
        return enumC32485OooO00o;
    }
}
