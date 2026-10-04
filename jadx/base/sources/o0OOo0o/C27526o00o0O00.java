package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.sticker.Sticker;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0OOO0oo.C27067OooO0o;
import o0OOO0oo.C27072OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: o0OOo0o.o00o0O00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$getLatestUsedStickers$2", m80623f = "StickerUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_2, StyleIdentifier.GRID_TABLE_4_ACCENT_2}, m80625m = "invokeSuspend")
public final class C27526o00o0O00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Sticker>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Collection f96489OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27538o00o0o0O f96490OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96491OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f96492OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96493OooOoOO;

    /* JADX INFO: renamed from: o0OOo0o.o00o0O00$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((Sticker) t2).getLastUsedTime()), Long.valueOf(((Sticker) t).getLastUsedTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27526o00o0O00(C27538o00o0o0O c27538o00o0o0O, Continuation continuation) {
        super(2, continuation);
        this.f96493OooOoOO = c27538o00o0o0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27526o00o0O00(this.f96493OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Sticker>> continuation) {
        return ((C27526o00o0O00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r8 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0075 -> B:20:0x0078). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        C27538o00o0o0O c27538o00o0o0O;
        Collection collection;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96491OooOoO;
        C27538o00o0o0O c27538o00o0o0O2 = this.f96493OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27067OooO0o c27067OooO0oOooO0oO = c27538o00o0o0O2.f96550OooO00o.OooO0oO(c27538o00o0o0O2.f96551OooO0O0.OooO0Oo());
            this.f96491OooOoO = 1;
            obj = C25252OooO0Oo.OooOOo(c27067OooO0oOooO0oO, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f96492OooOoO0;
            collection = this.f96489OooOo;
            C27538o00o0o0O c27538o00o0o0O3 = this.f96490OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C34431OooOo0.OooOo0o(collection, (Iterable) obj);
            c27538o00o0o0O = c27538o00o0o0O3;
            if (it.hasNext()) {
                C27072OooOO0O c27072OooOO0OOooO00o = c27538o00o0o0O.f96550OooO00o.OooO00o(((StickerCollection) it.next()).getId());
                this.f96490OooOo0o = c27538o00o0o0O;
                this.f96489OooOo = collection;
                this.f96492OooOoO0 = it;
                this.f96491OooOoO = 2;
                Object objOooOOo = C25252OooO0Oo.OooOOo(c27072OooOO0OOooO00o, this);
                if (objOooOOo != enumC32485OooO00o) {
                    c27538o00o0o0O3 = c27538o00o0o0O;
                    obj = objOooOOo;
                    C34431OooOo0.OooOo0o(collection, (Iterable) obj);
                    c27538o00o0o0O = c27538o00o0o0O3;
                    if (it.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : (List) collection) {
                            if (((Sticker) obj2).getLastUsedTime() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return oOo000Oo.OooOo.o00Oo0(oOo000Oo.OooOo.o00O0O(arrayList, new OooO00o()), 18);
                    }
                }
                return enumC32485OooO00o;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        it = ((Iterable) obj).iterator();
        c27538o00o0o0O = c27538o00o0o0O2;
        collection = arrayList2;
        if (it.hasNext()) {
        }
    }
}
