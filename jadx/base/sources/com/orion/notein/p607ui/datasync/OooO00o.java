package com.orion.notein.p607ui.datasync;

import android.text.format.DateUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.lifecycle.OooOOOO;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o00.C28201OooooO0;
import o0oOoOo.C31033OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33764OoooOOo;
import oO0o0Oo.C33765OoooOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33801OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initOverviewSection$2", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CloudSyncDetailsFragment f71496OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f71497OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.datasync.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initOverviewSection$2$1", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {167}, m80625m = "invokeSuspend")
    public static final class C19199OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CloudSyncDetailsFragment f71498OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71499OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.datasync.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment$initOverviewSection$2$1$1", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19200OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C31033OooO0Oo, Boolean, Continuation<? super C32443OooOOO<? extends C31033OooO0Oo, ? extends Boolean>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ boolean f71500OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ C31033OooO0Oo f71501OooOo0o;

            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(C31033OooO0Oo c31033OooO0Oo, Boolean bool, Continuation<? super C32443OooOOO<? extends C31033OooO0Oo, ? extends Boolean>> continuation) {
                boolean zBooleanValue = bool.booleanValue();
                C19200OooO00o c19200OooO00o = new C19200OooO00o(3, continuation);
                c19200OooO00o.f71501OooOo0o = c31033OooO0Oo;
                c19200OooO00o.f71500OooOo = zBooleanValue;
                return c19200OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return new C32443OooOOO(this.f71501OooOo0o, Boolean.valueOf(this.f71500OooOo));
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.datasync.OooO00o$OooO00o$OooO0O0 */
        public static final class OooO0O0<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ CloudSyncDetailsFragment f71502OooOo0o;

            public OooO0O0(CloudSyncDetailsFragment cloudSyncDetailsFragment) {
                this.f71502OooOo0o = cloudSyncDetailsFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                C31033OooO0Oo c31033OooO0Oo = (C31033OooO0Oo) c32443OooOOO.f116638OooOo0o;
                boolean zBooleanValue = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
                if (c31033OooO0Oo == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f71502OooOo0o;
                C31033OooO0Oo.OooO00o oooO00o = c31033OooO0Oo.f110787OooO00o;
                int i = c31033OooO0Oo.f110789OooO0OO;
                int i2 = c31033OooO0Oo.f110790OooO0Oo;
                if (zBooleanValue) {
                    TextView textView = cloudSyncDetailsFragment.f71419OooOooO;
                    if (textView == null) {
                        OooOOO0.OooOOOO("tvSyncState");
                        throw null;
                    }
                    textView.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_state_cancelling));
                    int i3 = i2 - i;
                    TextView textView2 = cloudSyncDetailsFragment.f71420OooOooo;
                    if (textView2 == null) {
                        OooOOO0.OooOOOO("tvSyncStateDesc");
                        throw null;
                    }
                    textView2.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_dirty_queue, new Integer(i3), new Integer(i2)));
                } else {
                    int iOrdinal = oooO00o.ordinal();
                    if (iOrdinal == 0) {
                        OooOOOO parentFragment = cloudSyncDetailsFragment.getParentFragment();
                        CloudSyncDetailsFragment.OooO00o oooO00o2 = parentFragment instanceof CloudSyncDetailsFragment.OooO00o ? (CloudSyncDetailsFragment.OooO00o) parentFragment : null;
                        if (oooO00o2 != null) {
                            oooO00o2.OooOOO();
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (iOrdinal == 1) {
                        TextView textView3 = cloudSyncDetailsFragment.f71419OooOooO;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("tvSyncState");
                            throw null;
                        }
                        textView3.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_state_ready));
                        TextView textView4 = cloudSyncDetailsFragment.f71420OooOooo;
                        if (textView4 == null) {
                            OooOOO0.OooOOOO("tvSyncStateDesc");
                            throw null;
                        }
                        textView4.setText("");
                    } else if (iOrdinal == 2) {
                        TextView textView5 = cloudSyncDetailsFragment.f71419OooOooO;
                        if (textView5 == null) {
                            OooOOO0.OooOOOO("tvSyncState");
                            throw null;
                        }
                        textView5.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_state_syncing));
                        int i4 = i2 - i;
                        TextView textView6 = cloudSyncDetailsFragment.f71420OooOooo;
                        if (textView6 == null) {
                            OooOOO0.OooOOOO("tvSyncStateDesc");
                            throw null;
                        }
                        textView6.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_dirty_queue, new Integer(i4), new Integer(i2)));
                    } else if (iOrdinal == 3) {
                        TextView textView7 = cloudSyncDetailsFragment.f71419OooOooO;
                        if (textView7 == null) {
                            OooOOO0.OooOOOO("tvSyncState");
                            throw null;
                        }
                        textView7.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_state_synced));
                        long j = c31033OooO0Oo.f110791OooO0o0;
                        String string = j <= 0 ? null : DateUtils.getRelativeTimeSpanString(j, System.currentTimeMillis(), 60000L, 262144).toString();
                        if (string != null) {
                            TextView textView8 = cloudSyncDetailsFragment.f71420OooOooo;
                            if (textView8 == null) {
                                OooOOO0.OooOOOO("tvSyncStateDesc");
                                throw null;
                            }
                            textView8.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_last_sync_time, string));
                        } else {
                            TextView textView9 = cloudSyncDetailsFragment.f71420OooOooo;
                            if (textView9 == null) {
                                OooOOO0.OooOOOO("tvSyncStateDesc");
                                throw null;
                            }
                            textView9.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_never_synced));
                        }
                    } else {
                        if (iOrdinal != 4 && iOrdinal != 5) {
                            throw new C32442OooOO0o();
                        }
                        TextView textView10 = cloudSyncDetailsFragment.f71419OooOooO;
                        if (textView10 == null) {
                            OooOOO0.OooOOOO("tvSyncState");
                            throw null;
                        }
                        textView10.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_state_paused));
                        int i5 = i2 - i;
                        TextView textView11 = cloudSyncDetailsFragment.f71420OooOooo;
                        if (textView11 == null) {
                            OooOOO0.OooOOOO("tvSyncStateDesc");
                            throw null;
                        }
                        textView11.setText(cloudSyncDetailsFragment.getString(R.string.cloud_sync_dirty_queue, new Integer(i5), new Integer(i2)));
                    }
                }
                C31033OooO0Oo.OooO00o oooO00o3 = C31033OooO0Oo.OooO00o.f110795OooOoO0;
                String string2 = cloudSyncDetailsFragment.getString((oooO00o == oooO00o3 || zBooleanValue) ? R.string.cloud_sync_action_pause_sync : R.string.cloud_sync_action_sync_now);
                OooOOO0.OooO0o(string2, "getString(...)");
                TextButtonView textButtonView = cloudSyncDetailsFragment.f71423Oooo000;
                if (textButtonView == null) {
                    OooOOO0.OooOOOO("btnSyncNow");
                    throw null;
                }
                textButtonView.setText(string2);
                TextButtonView textButtonView2 = cloudSyncDetailsFragment.f71423Oooo000;
                if (textButtonView2 == null) {
                    OooOOO0.OooOOOO("btnSyncNow");
                    throw null;
                }
                textButtonView2.setActivated(oooO00o == oooO00o3 && !zBooleanValue);
                TextButtonView textButtonView3 = cloudSyncDetailsFragment.f71423Oooo000;
                if (textButtonView3 == null) {
                    OooOOO0.OooOOOO("btnSyncNow");
                    throw null;
                }
                textButtonView3.setEnabled(!zBooleanValue);
                if (oooO00o == oooO00o3 || zBooleanValue) {
                    View view = cloudSyncDetailsFragment.f71424Oooo00O;
                    if (view == null) {
                        OooOOO0.OooOOOO("vSyncingIndicator");
                        throw null;
                    }
                    view.setVisibility(0);
                    View view2 = cloudSyncDetailsFragment.f71424Oooo00O;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("vSyncingIndicator");
                        throw null;
                    }
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(cloudSyncDetailsFragment.requireContext(), R.anim.rotate_loop);
                    OooOOO0.OooO0o(animationLoadAnimation, "loadAnimation(...)");
                    view2.startAnimation(animationLoadAnimation);
                } else {
                    View view3 = cloudSyncDetailsFragment.f71424Oooo00O;
                    if (view3 == null) {
                        OooOOO0.OooOOOO("vSyncingIndicator");
                        throw null;
                    }
                    view3.setVisibility(8);
                    View view4 = cloudSyncDetailsFragment.f71424Oooo00O;
                    if (view4 == null) {
                        OooOOO0.OooOOOO("vSyncingIndicator");
                        throw null;
                    }
                    view4.clearAnimation();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19199OooO00o(CloudSyncDetailsFragment cloudSyncDetailsFragment, Continuation<? super C19199OooO00o> continuation) {
            super(2, continuation);
            this.f71498OooOo = cloudSyncDetailsFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19199OooO00o(this.f71498OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19199OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71499OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CloudSyncDetailsFragment cloudSyncDetailsFragment = this.f71498OooOo;
                C28201OooooO0 c28201OooooO0OooOooo = cloudSyncDetailsFragment.OooOooo();
                C28201OooooO0 c28201OooooO0OooOooo2 = cloudSyncDetailsFragment.OooOooo();
                C19200OooO00o c19200OooO00o = new C19200OooO00o(3, null);
                OooO0O0 oooO0O0 = new OooO0O0(cloudSyncDetailsFragment);
                this.f71499OooOo0o = 1;
                Object objOooO00o = C33801OooOOO.OooO00o(this, C33765OoooOo0.f121745OooOo0o, new C33764OoooOOo(c19200OooO00o, null), oooO0O0, new InterfaceC33721OooO0o[]{c28201OooooO0OooOooo.f99967Oooo0O0, c28201OooooO0OooOooo2.f99951OooOo});
                if (objOooO00o != obj2) {
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(CloudSyncDetailsFragment cloudSyncDetailsFragment, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f71496OooOo = cloudSyncDetailsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO00o oooO00o = new OooO00o(this.f71496OooOo, continuation);
        oooO00o.f71497OooOo0o = obj;
        return oooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f71497OooOo0o, null, null, new C19199OooO00o(this.f71496OooOo, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
