package com.orion.notein.p607ui.noteeditor;

import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$imageProvider$1", m80623f = "NoteEditorFragment.kt", m80624l = {411}, m80625m = "getImageBitmap")
public final class OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment.OooO0o f73339OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f73340OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f73341OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(NoteEditorFragment.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f73339OooOo = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f73340OooOo0o = obj;
        this.f73341OooOoO0 |= Integer.MIN_VALUE;
        return this.f73339OooOo.OooO00o(null, this);
    }
}
