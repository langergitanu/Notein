package o0o0O000;

import com.orion.notein.p607ui.p609vo.FolderVO;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f107689OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f107690OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.MoveToFolderFragment$selectFolderWhenAvailable$$inlined$map$1$2", m80623f = "MoveToFolderFragment.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f107691OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f107692OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f107692OooOo0o = obj;
            this.f107691OooOo |= Integer.MIN_VALUE;
            return OooOo00.this.emit(null, this);
        }
    }

    public OooOo00(InterfaceC33723OooO0oO interfaceC33723OooO0oO, String str) {
        this.f107690OooOo0o = interfaceC33723OooO0oO;
        this.f107689OooOo = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        T next;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f107691OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f107691OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f107692OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f107691OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            Iterator<T> it = ((List) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((FolderVO) next).getId(), this.f107689OooOo)) {
                    break;
                }
            }
            oooO00o.f107691OooOo = 1;
            if (this.f107690OooOo0o.emit(next, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
