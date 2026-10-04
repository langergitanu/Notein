package o0oOOooo;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27532o00o0Oo;
import o0OOo0o.C27538o00o0o0O;
import o0oOoOo.C31078OoooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oOOooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30905OooO0oO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30906OooO0oo f110458OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f110459OooOo0o;

    /* JADX INFO: renamed from: o0oOOooo.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationViewModel$special$$inlined$map$1$2", m80623f = "StickerCollectionCreationViewModel.kt", m80624l = {57, 50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f110460OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110461OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public C30905OooO0oO f110463OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public InterfaceC33723OooO0oO f110464OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public Iterator f110465OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public Collection f110466OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public Collection f110467OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public Uri f110468OooOooo;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f110461OooOo0o = obj;
            this.f110460OooOo |= Integer.MIN_VALUE;
            return C30905OooO0oO.this.emit(null, this);
        }
    }

    public C30905OooO0oO(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30906OooO0oo c30906OooO0oo) {
        this.f110459OooOo0o = interfaceC33723OooO0oO;
        this.f110458OooOo = c30906OooO0oo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        if (r7.emit((java.util.List) r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0098 -> B:23:0x0099). Please report as a decompilation issue!!! */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        OooO00o oooO00o;
        C30905OooO0oO<T> c30905OooO0oO;
        Iterator<T> it;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        Collection collection;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f110460OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f110460OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooO0o = oooO00o.f110461OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f110460OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            c30905OooO0oO = this;
            it = list.iterator();
            interfaceC33723OooO0oO = this.f110459OooOo0o;
            collection = arrayList;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        Uri uri = oooO00o.f110468OooOooo;
        collection = oooO00o.f110467OooOooO;
        it = oooO00o.f110465OooOoo;
        Collection collection2 = oooO00o.f110466OooOoo0;
        interfaceC33723OooO0oO = oooO00o.f110464OooOoOO;
        c30905OooO0oO = oooO00o.f110463OooOoO0;
        C32446OooOOOo.OooO0O0(objOooO0o);
        collection.add(new C31078OoooOo0(uri, ((Boolean) objOooO0o).booleanValue(), true));
        collection = collection2;
        if (it.hasNext()) {
            uri = (Uri) it.next();
            C27538o00o0o0O c27538o00o0o0O = c30905OooO0oO.f110458OooOo.f110470OooO0Oo;
            oooO00o.f110463OooOoO0 = c30905OooO0oO;
            oooO00o.f110464OooOoOO = interfaceC33723OooO0oO;
            Collection collection3 = collection;
            oooO00o.f110466OooOoo0 = collection3;
            oooO00o.f110465OooOoo = it;
            oooO00o.f110467OooOooO = collection3;
            oooO00o.f110468OooOooo = uri;
            oooO00o.f110460OooOo = 1;
            c27538o00o0o0O.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27532o00o0Oo(c27538o00o0o0O, uri, null), oooO00o);
            if (objOooO0o != enumC32485OooO00o) {
                collection2 = collection;
                collection.add(new C31078OoooOo0(uri, ((Boolean) objOooO0o).booleanValue(), true));
                collection = collection2;
                if (it.hasNext()) {
                    oooO00o.f110463OooOoO0 = null;
                    oooO00o.f110464OooOoOO = null;
                    oooO00o.f110466OooOoo0 = null;
                    oooO00o.f110465OooOoo = null;
                    oooO00o.f110467OooOooO = null;
                    oooO00o.f110468OooOooo = null;
                    oooO00o.f110460OooOo = 2;
                }
            }
        }
        return enumC32485OooO00o;
    }
}
