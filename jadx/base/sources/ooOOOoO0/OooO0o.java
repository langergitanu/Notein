package ooOOOoO0;

import Oooo0oO.C21023OooO0Oo;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public interface OooO0o<M extends Member> {

    public static final class OooO00o {
        public static <M extends Member> void OooO00o(OooO0o<? extends M> oooO0o, Object[] args) {
            OooOOO0.OooO0oO(args, "args");
            if (o000ooOO.OooOOO0.OooO0OO(oooO0o) == args.length) {
                return;
            }
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(o000ooOO.OooOOO0.OooO0OO(oooO0o));
            sb.append(" arguments, but ");
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" were provided.", args.length, sb));
        }
    }

    List<Type> OooO00o();

    M OooO0O0();

    Object call(Object[] objArr);

    Type getReturnType();
}
