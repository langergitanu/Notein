package o0Oo0ooO;

import com.orion.notein.domain.models.LabelRef;
import com.orion.notein.p607ui.label.C23135OooO0o0;
import com.orion.notein.p607ui.label.ItemData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0ooO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.ItemLabelViewModel$addLabelToItems$1", m80623f = "ItemLabelViewModel.kt", m80624l = {170}, m80625m = "invokeSuspend")
public final class C28417OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f100726OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C23135OooO0o0 f100727OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public LabelRef f100728OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f100729OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f100730OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f100731OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f100732OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C23135OooO0o0 f100733OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ long f100734OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28417OooOO0o(C23135OooO0o0 c23135OooO0o0, long j, Continuation<? super C28417OooOO0o> continuation) {
        super(2, continuation);
        this.f100733OooOooO = c23135OooO0o0;
        this.f100734OooOooo = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28417OooOO0o c28417OooOO0o = new C28417OooOO0o(this.f100733OooOooO, this.f100734OooOooo, continuation);
        c28417OooOO0o.f100731OooOoo = obj;
        return c28417OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28417OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0086 -> B:17:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:19:0x00a9). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        Iterator it;
        Collection collection;
        long j;
        C23135OooO0o0 c23135OooO0o0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100732OooOoo0;
        C23135OooO0o0 c23135OooO0o02 = this.f100733OooOooO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f100731OooOoo;
            List list = (List) c23135OooO0o02.f72017OooOO0O.getValue();
            ArrayList arrayList = new ArrayList();
            interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
            it = list.iterator();
            collection = arrayList;
            j = this.f100734OooOooo;
            c23135OooO0o0 = c23135OooO0o02;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.f100730OooOoOO;
            LabelRef labelRef = this.f100728OooOoO;
            Iterator it2 = this.f100729OooOoO0;
            Collection collection2 = this.f100726OooOo;
            C23135OooO0o0 c23135OooO0o03 = this.f100727OooOo0o;
            InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f100731OooOoo;
            C32446OooOOOo.OooO0O0(obj);
            LabelRef labelRefOooO0o0 = labelRef;
            collection = collection2;
            c23135OooO0o0 = c23135OooO0o03;
            interfaceC33636Oooo00o = interfaceC33636Oooo00o3;
            it = it2;
            j = j2;
            if (labelRefOooO0o0 != null) {
                collection.add(labelRefOooO0o0);
            }
            if (!it.hasNext()) {
                C23135OooO0o0.OooO0o(c23135OooO0o02, (List) collection);
                return C32460OooOooO.f116667OooO00o;
            }
            ItemData itemData = (ItemData) it.next();
            labelRefOooO0o0 = C23135OooO0o0.OooO0o0(c23135OooO0o0, itemData);
            if (labelRefOooO0o0 != null) {
                String itemId = labelRefOooO0o0.getItemId();
                int value = labelRefOooO0o0.getItemType().getValue();
                String extraInfo = labelRefOooO0o0.getExtraInfo();
                this.f100731OooOoo = interfaceC33636Oooo00o;
                this.f100727OooOo0o = c23135OooO0o0;
                this.f100726OooOo = collection;
                this.f100729OooOoO0 = it;
                this.f100728OooOoO = labelRefOooO0o0;
                this.f100730OooOoOO = j;
                this.f100732OooOoo0 = 1;
                if (c23135OooO0o0.f72013OooO0o0.OooO0O0(value, j, itemId, extraInfo, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                j2 = j;
                it2 = it;
                collection2 = collection;
                c23135OooO0o03 = c23135OooO0o0;
                interfaceC33636Oooo00o3 = interfaceC33636Oooo00o;
                labelRef = labelRefOooO0o0;
                LabelRef labelRefOooO0o02 = labelRef;
                collection = collection2;
                c23135OooO0o0 = c23135OooO0o03;
                interfaceC33636Oooo00o = interfaceC33636Oooo00o3;
                it = it2;
                j = j2;
                if (labelRefOooO0o02 != null) {
                }
                if (!it.hasNext()) {
                }
            } else {
                C34406OooO00o.f123390OooO00o.OooO0OO("addLabelToItems: invalid itemType: " + itemData, new Object[0]);
                if (labelRefOooO0o02 != null) {
                }
                if (!it.hasNext()) {
                }
            }
        }
    }
}
