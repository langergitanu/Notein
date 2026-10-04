package o0OOo0o;

import com.orion.notein.domain.models.page.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getImagesByPageId$2", m80623f = "NoteUseCase.kt", m80624l = {454, 455}, m80625m = "invokeSuspend")
public final class o00O0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Image>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f95994OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f95995OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f95996OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f95997OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f95998OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f95999OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f96000OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f96001OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f96002OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f95999OooOoo = c27449o00O0OoO;
        this.f96001OooOooO = str;
        this.f96002OooOooo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0OO(this.f96001OooOooO, this.f96002OooOooo, continuation, this.f95999OooOoo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Image>> continuation) {
        return ((o00O0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0074 -> B:20:0x0079). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        Iterator it;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96000OooOoo0;
        String str2 = this.f96002OooOooo;
        C27449o00O0OoO c27449o00O0OoO = this.f95999OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
            this.f96000OooOoo0 = 1;
            obj = c26596o00O0o0.OooOOO0(this.f96001OooOooO, str2, this);
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.f95998OooOoOO;
            it = this.f95996OooOoO;
            Collection collection = this.f95997OooOoO0;
            String str3 = this.f95994OooOo;
            C27449o00O0OoO c27449o00O0OoO2 = this.f95995OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            arrayList.add((Image) obj);
            arrayList = collection;
            str = str3;
            c27449o00O0OoO = c27449o00O0OoO2;
            if (it.hasNext()) {
                Image image = (Image) it.next();
                this.f95995OooOo0o = c27449o00O0OoO;
                this.f95994OooOo = str;
                Collection collection2 = arrayList;
                this.f95997OooOoO0 = collection2;
                this.f95996OooOoO = it;
                this.f95998OooOoOO = collection2;
                this.f96000OooOoo0 = 2;
                Object objOooO0O0 = C27449o00O0OoO.OooO0O0(c27449o00O0OoO, image, str, this);
                if (objOooO0O0 != enumC32485OooO00o) {
                    str3 = str;
                    obj = objOooO0O0;
                    c27449o00O0OoO2 = c27449o00O0OoO;
                    collection = arrayList;
                    arrayList.add((Image) obj);
                    arrayList = collection;
                    str = str3;
                    c27449o00O0OoO = c27449o00O0OoO2;
                    if (it.hasNext()) {
                        return (List) arrayList;
                    }
                }
                return enumC32485OooO00o;
            }
        }
        Iterable iterable = (Iterable) obj;
        arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        it = iterable.iterator();
        str = str2;
        if (it.hasNext()) {
        }
    }
}
