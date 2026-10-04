package o0OOo0o;

import com.orion.notein.domain.models.sticker.Sticker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o00o0o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$updateStickerLastUsedTime$2", m80623f = "StickerUseCase.kt", m80624l = {501, 505}, m80625m = "invokeSuspend")
public final class C27537o00o0o00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f96542OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27538o00o0o0O f96543OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Collection f96544OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f96545OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96546OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96547OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Map<String, List<String>> f96548OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27537o00o0o00(Map<String, ? extends List<String>> map, C27538o00o0o0O c27538o00o0o0O, Continuation<? super C27537o00o0o00> continuation) {
        super(2, continuation);
        this.f96548OooOoo0 = map;
        this.f96547OooOoo = c27538o00o0o0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27537o00o0o00(this.f96548OooOoo0, this.f96547OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27537o00o0o00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        if (r2.OooOOO(r5, r17) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0077 -> B:17:0x007a). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        Iterator<Map.Entry<String, List<String>>> it;
        C27538o00o0o0O c27538o00o0o0O;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96546OooOoOO;
        C27538o00o0o0O c27538o00o0o0O2 = this.f96547OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Map<String, List<String>> map = this.f96548OooOoo0;
            arrayList = new ArrayList(map.size());
            it = map.entrySet().iterator();
            c27538o00o0o0O = c27538o00o0o0O2;
            if (it.hasNext()) {
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
        arrayList = this.f96544OooOoO;
        Iterator<Map.Entry<String, List<String>>> it2 = this.f96545OooOoO0;
        Collection collection = this.f96542OooOo;
        C27538o00o0o0O c27538o00o0o0O3 = this.f96543OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27538o00o0o0O c27538o00o0o0O4 = c27538o00o0o0O3;
        Iterator<Map.Entry<String, List<String>>> it3 = it2;
        Collection collection2 = collection;
        Object objOooO0o = obj;
        arrayList.add((List) objOooO0o);
        arrayList = collection2;
        it = it3;
        c27538o00o0o0O = c27538o00o0o0O4;
        if (it.hasNext()) {
            Map.Entry<String, List<String>> next = it.next();
            String key = next.getKey();
            List<String> value = next.getValue();
            InterfaceC27321Oooo0o interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
            this.f96543OooOo0o = c27538o00o0o0O;
            Collection collection3 = arrayList;
            this.f96542OooOo = collection3;
            this.f96545OooOoO0 = it;
            this.f96544OooOoO = collection3;
            this.f96546OooOoOO = 1;
            objOooO0o = interfaceC27321Oooo0o.OooO0o(value, key, this);
            if (objOooO0o != enumC32485OooO00o) {
                c27538o00o0o0O4 = c27538o00o0o0O;
                it3 = it;
                collection2 = arrayList;
                arrayList.add((List) objOooO0o);
                arrayList = collection2;
                it = it3;
                c27538o00o0o0O = c27538o00o0o0O4;
                if (it.hasNext()) {
                    ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00((List) arrayList);
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooOo00, 10));
                    Iterator it4 = arrayListOooOo00.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(Sticker.copy$default((Sticker) it4.next(), null, null, null, System.currentTimeMillis(), false, 0.0f, 55, null));
                    }
                    InterfaceC27321Oooo0o interfaceC27321Oooo0o2 = c27538o00o0o0O2.f96550OooO00o;
                    this.f96543OooOo0o = null;
                    this.f96542OooOo = null;
                    this.f96545OooOoO0 = null;
                    this.f96544OooOoO = null;
                    this.f96546OooOoOO = 2;
                }
            }
        }
        return enumC32485OooO00o;
    }
}
