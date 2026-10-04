package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.StrokeEntity;
import com.orion.notein.domain.models.page.Stroke;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {2, 1, 0})
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.mapper.StrokeMapper$toStrokesParallel$3$1$jobs$1$1", m80623f = "StrokeMapper.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class StrokeMapper$toStrokesParallel$3$1$jobs$1$1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
    final /* synthetic */ List<StrokeEntity> $entities;
    final /* synthetic */ AtomicInteger $index;
    final /* synthetic */ Stroke[] $result;
    int label;
    final /* synthetic */ StrokeMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeMapper$toStrokesParallel$3$1$jobs$1$1(AtomicInteger atomicInteger, List<StrokeEntity> list, Stroke[] strokeArr, StrokeMapper strokeMapper, Continuation<? super StrokeMapper$toStrokesParallel$3$1$jobs$1$1> continuation) {
        super(2, continuation);
        this.$index = atomicInteger;
        this.$entities = list;
        this.$result = strokeArr;
        this.this$0 = strokeMapper;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new StrokeMapper$toStrokesParallel$3$1$jobs$1$1(this.$index, this.$entities, this.$result, this.this$0, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        while (true) {
            int andIncrement = this.$index.getAndIncrement();
            if (andIncrement >= this.$entities.size()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.$result[andIncrement] = this.this$0.toStroke(this.$entities.get(andIncrement));
        }
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((StrokeMapper$toStrokesParallel$3$1$jobs$1$1) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
