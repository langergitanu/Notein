package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.NoteTnNavigatorView", m80623f = "NoteTnNavigatorView.kt", m80624l = {164}, m80625m = "setTnNavigatorInfo")
public final class OooO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0OO.OooO0O0 f76114OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteTnNavigatorView f76115OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteTnNavigatorView f76116OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f76117OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f76118OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(NoteTnNavigatorView noteTnNavigatorView, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f76116OooOoO = noteTnNavigatorView;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f76117OooOoO0 = obj;
        this.f76118OooOoOO |= Integer.MIN_VALUE;
        return this.f76116OooOoO.OooO0O0(null, this);
    }
}
