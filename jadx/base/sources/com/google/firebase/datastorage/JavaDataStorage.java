package com.google.firebase.datastorage;

import Oooo0.C20857Oooooo;
import android.content.Context;
import com.facebook.soloader.OooOo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AbstractC24015OooO0Oo;
import kotlin.jvm.internal.C24029OooOoOO;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oO0.C24323OooO;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00o0.OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo0000O.OooO;
import oOo000Oo.C34436OooOoOO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120'*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m80612d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Lo0000oOO/OooO0o0$OooO00o;", "key", "defaultValue", "getSync", "(Lo0000oOO/OooO0o0$OooO00o;Ljava/lang/Object;)Ljava/lang/Object;", "", "contains", "(Lo0000oOO/OooO0o0$OooO00o;)Z", "value", "Lo0000oOO/OooO0o0;", "putSync", "(Lo0000oOO/OooO0o0$OooO00o;Ljava/lang/Object;)Lo0000oOO/OooO0o0;", "", "getAllSync", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lo0000oOO/OooO0O0;", "LoO00ooO/OooOooO;", "transform", "editSync", "(LoO0O000o/OooOO0o;)Lo0000oOO/OooO0o0;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "editLock", "Ljava/lang/ThreadLocal;", "Lo0000o0O/OooOO0;", "dataStore$delegate", "LoO0O00o0/OooO0O0;", "getDataStore", "(Landroid/content/Context;)Lo0000o0O/OooOO0;", "dataStore", "Lo0000o0O/OooOO0;", "com.google.firebase-firebase-common"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class JavaDataStorage {
    static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] $$delegatedProperties = {C24035Oooo00o.f80943OooO00o.OooO0oo(new C24029OooOoOO(AbstractC24015OooO0Oo.NO_RECEIVER, JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    private final Context context;
    private final OooOO0<AbstractC24338OooO0o0> dataStore;

    /* JADX INFO: renamed from: dataStore$delegate, reason: from kotlin metadata */
    private final OooO0O0 dataStore;
    private final ThreadLocal<Boolean> editLock;
    private final String name;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$contains$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "", "<anonymous>", "(LoO0o0OO/Oooo00o;)Z"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", m80623f = "JavaDataStorage.kt", m80624l = {111}, m80625m = "invokeSuspend")
    public static final class C170251 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {
        final /* synthetic */ AbstractC24338OooO0o0.OooO00o<T> $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C170251(AbstractC24338OooO0o0.OooO00o<T> oooO00o, Continuation<? super C170251> continuation) {
            super(2, continuation);
            this.$key = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C170251(this.$key, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33721OooO0o data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = C25252OooO0Oo.OooOo00(data, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
            return Boolean.valueOf(abstractC24338OooO0o0 != null ? abstractC24338OooO0o0.OooO0O0(this.$key) : false);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((C170251) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "Lo0000oOO/OooO0o0;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Lo0000oOO/OooO0o0;"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", m80623f = "JavaDataStorage.kt", m80624l = {207}, m80625m = "invokeSuspend")
    public static final class C170261 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {
        final /* synthetic */ InterfaceC32507OooOO0o<C24334OooO0O0, C32460OooOooO> $transform;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Lo0000oOO/OooO0O0;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(Lo0000oOO/OooO0O0;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", m80623f = "JavaDataStorage.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {
            final /* synthetic */ InterfaceC32507OooOO0o<C24334OooO0O0, C32460OooOooO> $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(InterfaceC32507OooOO0o<? super C24334OooO0O0, C32460OooOooO> interfaceC32507OooOO0o, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$transform = interfaceC32507OooOO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                this.$transform.invoke((C24334OooO0O0) this.L$0);
                return C32460OooOooO.f116667OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((AnonymousClass1) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C170261(InterfaceC32507OooOO0o<? super C24334OooO0O0, C32460OooOooO> interfaceC32507OooOO0o, Continuation<? super C170261> continuation) {
            super(2, continuation);
            this.$transform = interfaceC32507OooOO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C170261(this.$transform, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    Object obj2 = JavaDataStorage.this.editLock.get();
                    Boolean bool = Boolean.TRUE;
                    if (OooOOO0.OooO0O0(obj2, bool)) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    JavaDataStorage.this.editLock.set(bool);
                    OooOO0 oooOO02 = JavaDataStorage.this.dataStore;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
                    this.label = 1;
                    obj = C24332OooO.OooO00o(oooOO02, anonymousClass1, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return (AbstractC24338OooO0o0) obj;
            } finally {
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
            }
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((C170261) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getAllSync$1 */
    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "", "Lo0000oOO/OooO0o0$OooO00o;", "", "<anonymous>", "(LoO0o0OO/Oooo00o;)Ljava/util/Map;"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", m80623f = "JavaDataStorage.kt", m80624l = {157}, m80625m = "invokeSuspend")
    public static final class C170271 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Map<AbstractC24338OooO0o0.OooO00o<?>, ? extends Object>>, Object> {
        int label;

        public C170271(Continuation<? super C170271> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C170271(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33721OooO0o data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = C25252OooO0Oo.OooOo00(data, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
            return abstractC24338OooO0o0 != null ? abstractC24338OooO0o0.OooO00o() : C34436OooOoOO.f123455OooOo0o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Map<AbstractC24338OooO0o0.OooO00o<?>, ? extends Object>> continuation) {
            return ((C170271) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getSync$1 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m80612d2 = {"T", "LoO0o0OO/Oooo00o;", "<anonymous>"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", m80623f = "JavaDataStorage.kt", m80624l = {91}, m80625m = "invokeSuspend")
    public static final class C170281<T> extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super T>, Object> {
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ AbstractC24338OooO0o0.OooO00o<T> $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C170281(AbstractC24338OooO0o0.OooO00o<T> oooO00o, T t, Continuation<? super C170281> continuation) {
            super(2, continuation);
            this.$key = oooO00o;
            this.$defaultValue = t;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C170281(this.$key, this.$defaultValue, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object objOooO0OO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33721OooO0o<T> data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = C25252OooO0Oo.OooOo00(data, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
            return (abstractC24338OooO0o0 == null || (objOooO0OO = abstractC24338OooO0o0.OooO0OO(this.$key)) == null) ? this.$defaultValue : objOooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super T> continuation) {
            return ((C170281) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "Lo0000oOO/OooO0o0;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Lo0000oOO/OooO0o0;"}, m80613k = 3, m80614mv = {2, 0, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", m80623f = "JavaDataStorage.kt", m80624l = {132}, m80625m = "invokeSuspend")
    public static final class C170291 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {
        final /* synthetic */ AbstractC24338OooO0o0.OooO00o<T> $key;
        final /* synthetic */ T $value;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"Lo0000oOO/OooO0O0;", TranslateLanguage.ITALIAN, "LoO00ooO/OooOooO;", "<anonymous>", "(Lo0000oOO/OooO0O0;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", m80623f = "JavaDataStorage.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {
            final /* synthetic */ AbstractC24338OooO0o0.OooO00o<T> $key;
            final /* synthetic */ T $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractC24338OooO0o0.OooO00o<T> oooO00o, T t, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$key = oooO00o;
                this.$value = t;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                ((C24334OooO0O0) this.L$0).OooO0oO(this.$key, this.$value);
                return C32460OooOooO.f116667OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((AnonymousClass1) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C170291(AbstractC24338OooO0o0.OooO00o<T> oooO00o, T t, Continuation<? super C170291> continuation) {
            super(2, continuation);
            this.$key = oooO00o;
            this.$value = t;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C170291(this.$key, this.$value, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            OooOO0 oooOO02 = JavaDataStorage.this.dataStore;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, null);
            this.label = 1;
            Object objOooO00o = C24332OooO.OooO00o(oooOO02, anonymousClass1, this);
            return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((C170291) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    public JavaDataStorage(Context context, String name) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        this.dataStore = C20857Oooooo.OooO0o(name, new OooO00o(this, 0), 10);
        this.dataStore = getDataStore(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dataStore_delegate$lambda$0(JavaDataStorage javaDataStorage, Context it) {
        OooOOO0.OooO0oO(it, "it");
        return OooOo.OooO0oO(C24323OooO.OooO00o(it, javaDataStorage.name));
    }

    private final OooOO0<AbstractC24338OooO0o0> getDataStore(Context context) {
        return (OooOO0) this.dataStore.getValue(context, $$delegatedProperties[0]);
    }

    public final <T> boolean contains(AbstractC24338OooO0o0.OooO00o<T> key) {
        OooOOO0.OooO0oO(key, "key");
        return ((Boolean) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C170251(key, null))).booleanValue();
    }

    public final AbstractC24338OooO0o0 editSync(InterfaceC32507OooOO0o<? super C24334OooO0O0, C32460OooOooO> transform) {
        OooOOO0.OooO0oO(transform, "transform");
        return (AbstractC24338OooO0o0) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C170261(transform, null));
    }

    public final Map<AbstractC24338OooO0o0.OooO00o<?>, Object> getAllSync() {
        return (Map) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C170271(null));
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getName() {
        return this.name;
    }

    public final <T> T getSync(AbstractC24338OooO0o0.OooO00o<T> key, T defaultValue) {
        OooOOO0.OooO0oO(key, "key");
        return (T) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C170281(key, defaultValue, null));
    }

    public final <T> AbstractC24338OooO0o0 putSync(AbstractC24338OooO0o0.OooO00o<T> key, T value) {
        OooOOO0.OooO0oO(key, "key");
        return (AbstractC24338OooO0o0) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C170291(key, value, null));
    }
}
