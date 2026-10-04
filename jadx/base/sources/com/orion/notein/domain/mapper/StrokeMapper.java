package com.orion.notein.domain.mapper;

import Oooo0.C20857Oooooo;
import android.graphics.RectF;
import androidx.appcompat.widget.C21532OooOOo;
import com.orion.notein.data.p602db.entity.StrokeEntity;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo0OO0.C31227OooO00o;
import o0oo0OO0.InterfaceC31229OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00oo.C32520OooO0oo;
import oO0O00oo.OooO;
import oO0O00oo.OooOO0;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.AbstractC33659Oooooo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33661OoooooO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.Oooo000;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34467OooOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/StrokeMapper;", "", "<init>", "()V", "Lcom/orion/notein/domain/models/page/Stroke;", "stroke", "Lcom/orion/notein/data/db/entity/StrokeEntity;", "toEntity", "(Lcom/orion/notein/domain/models/page/Stroke;)Lcom/orion/notein/data/db/entity/StrokeEntity;", "entity", "LoO00ooO/OooOooO;", "fillEntity", "(Lcom/orion/notein/domain/models/page/Stroke;Lcom/orion/notein/data/db/entity/StrokeEntity;)V", "toStroke", "(Lcom/orion/notein/data/db/entity/StrokeEntity;)Lcom/orion/notein/domain/models/page/Stroke;", "fillModel", "(Lcom/orion/notein/data/db/entity/StrokeEntity;Lcom/orion/notein/domain/models/page/Stroke;)V", "", "entities", "toStrokesParallel", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LoOo00O0O/OooO0OO;", "json", "LoOo00O0O/OooO0OO;", "Lo0oo0OO0/OooO00o;", "inkStrokeConverts", "Lo0oo0OO0/OooO00o;", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class StrokeMapper {
    private static final int PARALLEL_THRESHOLD = 256;
    private static volatile AbstractC33659Oooooo cachedDispatcher;
    private static volatile int cachedParallelism;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int defaultParallelism = 7;
    private final AbstractC34457OooO0OO json = C34467OooOo0.OooO00o(new C22977OooO0o0(0));
    private final C31227OooO00o inkStrokeConverts = new C31227OooO00o();

    @Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/StrokeMapper$Companion;", "", "<init>", "()V", "", "currentParallelism", "()I", "LoO0o0OO/OooOooO;", "getDefaultLimitedDispatcher", "()LoO0o0OO/OooOooO;", "defaultLimitedDispatcher", "defaultParallelism", "I", "getDefaultParallelism", "setDefaultParallelism", "(I)V", "PARALLEL_THRESHOLD", "cachedParallelism", "LoO0o0OO/Oooooo;", "cachedDispatcher", "LoO0o0OO/Oooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int currentParallelism() {
            int iMin = Math.min(Runtime.getRuntime().availableProcessors() - 1, getDefaultParallelism());
            if (iMin < 1) {
                return 1;
            }
            return iMin;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized AbstractC33630OooOooO getDefaultLimitedDispatcher() {
            AbstractC33659Oooooo abstractC33659Oooooo;
            try {
                int iCurrentParallelism = currentParallelism();
                if (StrokeMapper.cachedDispatcher == null || StrokeMapper.cachedParallelism != iCurrentParallelism) {
                    AbstractC33659Oooooo abstractC33659Oooooo2 = StrokeMapper.cachedDispatcher;
                    if (abstractC33659Oooooo2 != null) {
                        abstractC33659Oooooo2.close();
                    }
                    StrokeMapper.cachedParallelism = iCurrentParallelism;
                    ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(iCurrentParallelism, new ThreadFactory() { // from class: com.orion.notein.domain.mapper.StrokeMapper$Companion$defaultLimitedDispatcher$1
                        private final AtomicInteger counter = new AtomicInteger(1);

                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            OooOOO0.OooO0oO(runnable, "runnable");
                            return new Thread(runnable, C21532OooOOo.OooO0OO(this.counter.getAndIncrement(), "StrokeBuild-"));
                        }
                    });
                    OooOOO0.OooO0o(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
                    StrokeMapper.cachedDispatcher = new C33661OoooooO(executorServiceNewFixedThreadPool);
                }
                abstractC33659Oooooo = StrokeMapper.cachedDispatcher;
                OooOOO0.OooO0Oo(abstractC33659Oooooo);
            } catch (Throwable th) {
                throw th;
            }
            return abstractC33659Oooooo;
        }

        public final int getDefaultParallelism() {
            return StrokeMapper.defaultParallelism;
        }

        public final void setDefaultParallelism(int i) {
            StrokeMapper.defaultParallelism = i;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.mapper.StrokeMapper$toStrokesParallel$2 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "", "Lcom/orion/notein/domain/models/page/Stroke;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Ljava/util/List;"}, m80613k = 3, m80614mv = {2, 1, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.mapper.StrokeMapper$toStrokesParallel$2", m80623f = "StrokeMapper.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C188752 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Stroke>>, Object> {
        final /* synthetic */ List<StrokeEntity> $entities;
        int label;
        final /* synthetic */ StrokeMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188752(List<StrokeEntity> list, StrokeMapper strokeMapper, Continuation<? super C188752> continuation) {
            super(2, continuation);
            this.$entities = list;
            this.this$0 = strokeMapper;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C188752(this.$entities, this.this$0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Stroke>> continuation) {
            return invoke2(interfaceC33636Oooo00o, (Continuation<? super List<Stroke>>) continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            List<StrokeEntity> list = this.$entities;
            StrokeMapper strokeMapper = this.this$0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(strokeMapper.toStroke((StrokeEntity) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<Stroke>> continuation) {
            return ((C188752) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.mapper.StrokeMapper$toStrokesParallel$3 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "", "Lcom/orion/notein/domain/models/page/Stroke;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Ljava/util/List;"}, m80613k = 3, m80614mv = {2, 1, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.mapper.StrokeMapper$toStrokesParallel$3", m80623f = "StrokeMapper.kt", m80624l = {164}, m80625m = "invokeSuspend")
    public static final class C188763 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Stroke>>, Object> {
        final /* synthetic */ List<StrokeEntity> $entities;
        int label;
        final /* synthetic */ StrokeMapper this$0;

        /* JADX INFO: renamed from: com.orion.notein.domain.mapper.StrokeMapper$toStrokesParallel$3$1, reason: invalid class name */
        @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "", "Lcom/orion/notein/domain/models/page/Stroke;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Ljava/util/List;"}, m80613k = 3, m80614mv = {2, 1, 0})
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.mapper.StrokeMapper$toStrokesParallel$3$1", m80623f = "StrokeMapper.kt", m80624l = {180}, m80625m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Stroke>>, Object> {
            final /* synthetic */ List<StrokeEntity> $entities;
            long J$0;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ StrokeMapper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<StrokeEntity> list, StrokeMapper strokeMapper, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$entities = list;
                this.this$0 = strokeMapper;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$entities, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Stroke>> continuation) {
                return invoke2(interfaceC33636Oooo00o, (Continuation<? super List<Stroke>>) continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                long j;
                Stroke[] strokeArr;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.label;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.L$0;
                    long jNanoTime = System.nanoTime();
                    Stroke[] strokeArr2 = new Stroke[this.$entities.size()];
                    AtomicInteger atomicInteger = new AtomicInteger(0);
                    OooO OooO2 = OooOO0.OooO(0, Math.min(StrokeMapper.INSTANCE.currentParallelism(), this.$entities.size()));
                    List<StrokeEntity> list = this.$entities;
                    StrokeMapper strokeMapper = this.this$0;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
                    Iterator<Integer> it = OooO2.iterator();
                    while (((C32520OooO0oo) it).f116817OooOoO0) {
                        ((Oooo000) it).nextInt();
                        arrayList.add(C33609OooO0oo.OooO00o(interfaceC33636Oooo00o, null, new StrokeMapper$toStrokesParallel$3$1$jobs$1$1(atomicInteger, list, strokeArr2, strokeMapper, null), 3));
                    }
                    this.L$0 = strokeArr2;
                    this.J$0 = jNanoTime;
                    this.label = 1;
                    if (C20857Oooooo.OooO00o(arrayList, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    j = jNanoTime;
                    strokeArr = strokeArr2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    strokeArr = (Stroke[]) this.L$0;
                    C32446OooOOOo.OooO0O0(obj);
                }
                ArrayList arrayList2 = new ArrayList(strokeArr.length);
                int length = strokeArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    Stroke stroke = strokeArr[i2];
                    int i4 = i3 + 1;
                    if (stroke == null) {
                        throw new IllegalStateException(("Missing stroke at index " + i3).toString());
                    }
                    arrayList2.add(stroke);
                    i2++;
                    i3 = i4;
                }
                long jNanoTime2 = System.nanoTime();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("StrokeMapper");
                c20358OooO00o.OooO00o("toStrokesParallel took " + ((jNanoTime2 - j) / ((long) 1000000)) + " ms for " + this.$entities.size() + " strokes", new Object[0]);
                return arrayList2;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<Stroke>> continuation) {
                return ((AnonymousClass1) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188763(List<StrokeEntity> list, StrokeMapper strokeMapper, Continuation<? super C188763> continuation) {
            super(2, continuation);
            this.$entities = list;
            this.this$0 = strokeMapper;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C188763(this.$entities, this.this$0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Stroke>> continuation) {
            return invoke2(interfaceC33636Oooo00o, (Continuation<? super List<Stroke>>) continuation);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$entities, this.this$0, null);
            this.label = 1;
            Object objOooO0o0 = C33633Oooo0.OooO0o0(anonymousClass1, this);
            return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<Stroke>> continuation) {
            return ((C188763) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO json$lambda$0(oOo00O0O.OooO0o Json) {
        OooOOO0.OooO0oO(Json, "$this$Json");
        Json.f123498OooO0OO = true;
        return C32460OooOooO.f116667OooO00o;
    }

    public void fillEntity(Stroke stroke, StrokeEntity entity) {
        String strOooO00o;
        OooOOO0.OooO0oO(stroke, "stroke");
        OooOOO0.OooO0oO(entity, "entity");
        DrawRecord record = stroke.getRecord();
        byte[] bArrSerializeToBytes = null;
        if (record != null) {
            AbstractC34457OooO0OO abstractC34457OooO0OO = this.json;
            abstractC34457OooO0OO.getClass();
            strOooO00o = abstractC34457OooO0OO.OooO00o(DrawRecord.INSTANCE.serializer(), record);
        } else {
            strOooO00o = null;
        }
        entity.setRecordJson(strOooO00o);
        entity.setInkStrokeJson(null);
        InkStrokeInfo inkStroke = stroke.getInkStroke();
        if (inkStroke != null) {
            C31227OooO00o c31227OooO00o = this.inkStrokeConverts;
            c31227OooO00o.getClass();
            bArrSerializeToBytes = c31227OooO00o.f111351OooO00o.serializeToBytes(inkStroke);
        }
        entity.setInkStrokeBlob(bArrSerializeToBytes);
        if (!(entity.getRecordJson() == null && entity.getInkStrokeBlob() == null) && stroke.isRegionLoadable()) {
            RectF boundingBox = stroke.getBoundingBox(1.0f);
            if (boundingBox.isEmpty()) {
                return;
            }
            entity.setLeft(Float.valueOf(boundingBox.left));
            entity.setTop(Float.valueOf(boundingBox.top));
            entity.setRight(Float.valueOf(boundingBox.right));
            entity.setBottom(Float.valueOf(boundingBox.bottom));
        }
    }

    public void fillModel(StrokeEntity entity, Stroke stroke) {
        DrawRecord drawRecord;
        OooOOO0.OooO0oO(entity, "entity");
        OooOOO0.OooO0oO(stroke, "stroke");
        String recordJson = entity.getRecordJson();
        InkStrokeInfo inkStrokeInfoDeserialize = null;
        Object obj = null;
        if (recordJson != null) {
            AbstractC34457OooO0OO abstractC34457OooO0OO = this.json;
            abstractC34457OooO0OO.getClass();
            drawRecord = (DrawRecord) abstractC34457OooO0OO.OooO0O0(recordJson, DrawRecord.INSTANCE.serializer());
        } else {
            drawRecord = null;
        }
        stroke.setRecord(drawRecord);
        if (entity.getInkStrokeBlob() != null) {
            C31227OooO00o c31227OooO00o = this.inkStrokeConverts;
            byte[] inkStrokeBlob = entity.getInkStrokeBlob();
            OooOOO0.OooO0Oo(inkStrokeBlob);
            c31227OooO00o.getClass();
            inkStrokeInfoDeserialize = c31227OooO00o.f111351OooO00o.deserializeFromBytes(inkStrokeBlob);
        } else if (entity.getInkStrokeJson() != null) {
            C31227OooO00o c31227OooO00o2 = this.inkStrokeConverts;
            String inkStrokeJson = entity.getInkStrokeJson();
            OooOOO0.OooO0Oo(inkStrokeJson);
            c31227OooO00o2.getClass();
            Iterator<T> it = c31227OooO00o2.f111353OooO0OO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((InterfaceC31229OooO0OO) next).canDeserialize(inkStrokeJson)) {
                    obj = next;
                    break;
                }
            }
            InterfaceC31229OooO0OO interfaceC31229OooO0OO = (InterfaceC31229OooO0OO) obj;
            if (interfaceC31229OooO0OO == null) {
                throw new IllegalArgumentException("Unrecognized data format");
            }
            inkStrokeInfoDeserialize = interfaceC31229OooO0OO.deserialize(inkStrokeJson);
        }
        stroke.setInkStroke(inkStrokeInfoDeserialize);
    }

    public abstract StrokeEntity toEntity(Stroke stroke);

    public abstract Stroke toStroke(StrokeEntity entity);

    public final Object toStrokesParallel(List<StrokeEntity> list, Continuation<? super List<Stroke>> continuation) {
        return list.isEmpty() ? C34434OooOoO.f123453OooOo0o : list.size() < 256 ? C33609OooO0oo.OooO0o(INSTANCE.getDefaultLimitedDispatcher(), new C188752(list, this, null), continuation) : C33609OooO0oo.OooO0o(INSTANCE.getDefaultLimitedDispatcher(), new C188763(list, this, null), continuation);
    }
}
