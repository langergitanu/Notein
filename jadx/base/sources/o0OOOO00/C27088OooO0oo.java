package o0OOOO00;

import com.orion.notein.domain.mapper.PageMapper;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperColors;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOOO00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27088OooO0oo implements InterfaceC33721OooO0o<PaperTheme> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94346OooOo0o;

    /* JADX INFO: renamed from: o0OOOO00.OooO0oo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94347OooOo0o;

        /* JADX INFO: renamed from: o0OOOO00.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.theme.ThemeLocalDataSource$getScratchPageTheme$$inlined$map$1$2", m80623f = "ThemeLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19843OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94348OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94349OooOo0o;

            public C19843OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94349OooOo0o = obj;
                this.f94348OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f94347OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            C19843OooO00o c19843OooO00o;
            Object lambdaPaperTheme;
            if (continuation instanceof C19843OooO00o) {
                c19843OooO00o = (C19843OooO00o) continuation;
                int i = c19843OooO00o.f94348OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19843OooO00o.f94348OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19843OooO00o = new C19843OooO00o(continuation);
                }
            }
            Object obj2 = c19843OooO00o.f94349OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19843OooO00o.f94348OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(OooOO0O.f94370OooOo0o);
                if (str == null) {
                    lambdaPaperTheme = new LambdaPaperTheme(new ColorPaperTheme(null, PaperColors.INSTANCE.getCOLOR_01(), 1, null), OooOO0O.f94361OooOOOO, PaperOrientation.VERTICAL, null, PaperStyle.INSTANCE.getBLANK_PAPER(), null, 40, null);
                } else {
                    lambdaPaperTheme = (PaperTheme) PageMapper.paperThemeGson.fromJson(str, (Class) PaperTheme.class);
                }
                c19843OooO00o.f94348OooOo = 1;
                if (this.f94347OooOo0o.emit(lambdaPaperTheme, c19843OooO00o) == enumC32485OooO00o) {
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

    public C27088OooO0oo(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f94346OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super PaperTheme> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94346OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
