package o0Oo0ooO;

import com.orion.notein.domain.models.LabelRef;
import com.orion.notein.p607ui.label.C23135OooO0o0;
import com.orion.notein.p607ui.label.ItemData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOoOo0.C27798OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0ooO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.ItemLabelViewModel$createAndSetLabel$1", m80623f = "ItemLabelViewModel.kt", m80624l = {210, 216}, m80625m = "invokeSuspend")
public final class C28419OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C23135OooO0o0 f100743OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f100744OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f100745OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f100746OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public LabelRef f100747OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f100748OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f100749OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f100750OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C23135OooO0o0 f100751OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f100752Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ int f100753Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28419OooOOO0(C23135OooO0o0 c23135OooO0o0, String str, int i, Continuation<? super C28419OooOOO0> continuation) {
        super(2, continuation);
        this.f100751OooOooo = c23135OooO0o0;
        this.f100752Oooo000 = str;
        this.f100753Oooo00O = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28419OooOOO0 c28419OooOOO0 = new C28419OooOOO0(this.f100751OooOooo, this.f100752Oooo000, this.f100753Oooo00O, continuation);
        c28419OooOOO0.f100750OooOooO = obj;
        return c28419OooOOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28419OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r1 == r7) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b4 -> B:22:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c3 -> B:24:0x00d9). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        Object objOooO0OO;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        List list;
        Iterator it;
        Collection collection;
        C23135OooO0o0 c23135OooO0o0;
        long j;
        C28419OooOOO0 c28419OooOOO0 = this;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = c28419OooOOO0.f100748OooOoo;
        C23135OooO0o0 c23135OooO0o02 = c28419OooOOO0.f100751OooOooo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) c28419OooOOO0.f100750OooOooO;
            C27798OooO0o0 c27798OooO0o0 = c23135OooO0o02.f72013OooO0o0;
            c28419OooOOO0.f100750OooOooO = interfaceC33636Oooo00o;
            c28419OooOOO0.f100748OooOoo = 1;
            objOooO0OO = c27798OooO0o0.OooO0OO(c28419OooOOO0.f100753Oooo00O, c28419OooOOO0.f100752Oooo000, c28419OooOOO0);
        } else if (i == 1) {
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) c28419OooOOO0.f100750OooOooO;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0OO = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = c28419OooOOO0.f100749OooOoo0;
            LabelRef labelRef = c28419OooOOO0.f100747OooOoOO;
            Iterator it2 = c28419OooOOO0.f100745OooOoO;
            Collection collection2 = c28419OooOOO0.f100746OooOoO0;
            C23135OooO0o0 c23135OooO0o03 = c28419OooOOO0.f100743OooOo;
            List list2 = c28419OooOOO0.f100744OooOo0o;
            InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) c28419OooOOO0.f100750OooOooO;
            C32446OooOOOo.OooO0O0(obj);
            LabelRef labelRefOooO0o0 = labelRef;
            c23135OooO0o0 = c23135OooO0o03;
            list = list2;
            interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
            it = it2;
            collection = collection2;
            j = j2;
            if (labelRefOooO0o0 != null) {
                collection.add(labelRefOooO0o0);
            }
            c28419OooOOO0 = this;
            if (!it.hasNext()) {
                C23135OooO0o0.OooO0o(c23135OooO0o02, (List) collection);
                List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(list);
                C33781o00o0O c33781o00o0O = c23135OooO0o02.f72017OooOO0O;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, listO0ooOO0);
                return C32460OooOooO.f116667OooO00o;
            }
            ItemData itemData = (ItemData) it.next();
            labelRefOooO0o0 = C23135OooO0o0.OooO0o0(c23135OooO0o0, itemData);
            if (labelRefOooO0o0 != null) {
                String itemId = labelRefOooO0o0.getItemId();
                int value = labelRefOooO0o0.getItemType().getValue();
                String extraInfo = labelRefOooO0o0.getExtraInfo();
                c28419OooOOO0.f100750OooOooO = interfaceC33636Oooo00o2;
                c28419OooOOO0.f100744OooOo0o = list;
                c28419OooOOO0.f100743OooOo = c23135OooO0o0;
                c28419OooOOO0.f100746OooOoO0 = collection;
                c28419OooOOO0.f100745OooOoO = it;
                c28419OooOOO0.f100747OooOoOO = labelRefOooO0o0;
                c28419OooOOO0.f100749OooOoo0 = j;
                c28419OooOOO0.f100748OooOoo = 2;
                if (c23135OooO0o0.f72013OooO0o0.OooO0O0(value, j, itemId, extraInfo, c28419OooOOO0) != enumC32485OooO00o) {
                    j2 = j;
                    it2 = it;
                    collection2 = collection;
                    c23135OooO0o03 = c23135OooO0o0;
                    list2 = list;
                    interfaceC33636Oooo00o3 = interfaceC33636Oooo00o2;
                    labelRef = labelRefOooO0o0;
                    LabelRef labelRefOooO0o02 = labelRef;
                    c23135OooO0o0 = c23135OooO0o03;
                    list = list2;
                    interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
                    it = it2;
                    collection = collection2;
                    j = j2;
                    if (labelRefOooO0o02 != null) {
                    }
                    c28419OooOOO0 = this;
                    if (!it.hasNext()) {
                    }
                }
                return enumC32485OooO00o;
            }
            C34406OooO00o.f123390OooO00o.OooO0OO("addLabelToItems: invalid itemType: " + itemData, new Object[0]);
            if (labelRefOooO0o02 != null) {
            }
            c28419OooOOO0 = this;
            if (!it.hasNext()) {
            }
        }
        long jLongValue = ((Number) objOooO0OO).longValue();
        List list3 = (List) c23135OooO0o02.f72017OooOO0O.getValue();
        ArrayList arrayList = new ArrayList();
        interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
        list = list3;
        it = list3.iterator();
        collection = arrayList;
        c23135OooO0o0 = c23135OooO0o02;
        j = jLongValue;
        if (!it.hasNext()) {
        }
    }
}
