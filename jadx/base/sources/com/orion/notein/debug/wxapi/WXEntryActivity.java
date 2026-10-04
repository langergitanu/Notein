package com.orion.notein.debug.wxapi;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0OOOoOo.AbstractActivityC27201OooO0O0;
import o0Oo0ooo.C28477OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/debug/wxapi/WXEntryActivity;", "Landroidx/appcompat/app/OooO0oo;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class WXEntryActivity extends AbstractActivityC27201OooO0O0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C22026ooOO f70401OooOoOO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28477OooOOO0.class), new OooO0O0(), new OooO00o(), new OooO0OO());

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return WXEntryActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.debug.wxapi.WXEntryActivity, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.o00o0O, java.lang.String] */
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
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            ?? r0 = WXEntryActivity.this;
            return r0.getString(r0);
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, com.orion.notein.debug.wxapi.WXEntryActivity, int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
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
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            ?? r0 = WXEntryActivity.this;
            return r0.putInt(r0, r0);
        }
    }

    @Override // o0OOOoOo.AbstractActivityC27201OooO0O0, androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        C28477OooOOO0 c28477OooOOO0 = (C28477OooOOO0) this.f70401OooOoOO.getValue();
        Intent intent = getIntent();
        OooOOO0.OooO0o(intent, "getIntent(...)");
        c28477OooOOO0.OooO0o(intent);
        finish();
    }
}
