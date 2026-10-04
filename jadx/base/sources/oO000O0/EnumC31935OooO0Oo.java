package oO000O0;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: renamed from: oO000O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC31935OooO0Oo implements OooO0OO {
    /* JADX INFO: Fake field, exist only in values array */
    ARGUMENT_OUTSIDE_DOMAIN("Argument {0} outside domain [{1} ; {2}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_SIZE_EXCEEDS_MAX_VARIABLES("array size cannot be greater than {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1("array sizes should have difference 1 ({0} != {1} + 1)"),
    /* JADX INFO: Fake field, exist only in values array */
    ARRAY_SUMS_TO_ZERO("array sums to zero"),
    /* JADX INFO: Fake field, exist only in values array */
    ASSYMETRIC_EIGEN_NOT_SUPPORTED("eigen decomposition of assymetric matrices not supported yet"),
    AT_LEAST_ONE_COLUMN("matrix must have at least one column"),
    AT_LEAST_ONE_ROW("matrix must have at least one row"),
    /* JADX INFO: Fake field, exist only in values array */
    BANDWIDTH("bandwidth ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    BESSEL_FUNCTION_BAD_ARGUMENT("Bessel function of order {0} cannot be computed for x = {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    BESSEL_FUNCTION_FAILED_CONVERGENCE("Bessel function of order {0} failed to converge for x = {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    BINOMIAL_INVALID_PARAMETERS_ORDER("must have n >= k for binomial coefficient (n, k), got k = {0}, n = {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    BINOMIAL_NEGATIVE_PARAMETER("must have n >= 0 for binomial coefficient (n, k), got n = {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_FORMAT_OBJECT_TO_FRACTION("statistics constructed from external moments cannot be cleared"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("cannot compute 0-th root of unity, indefinite result"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("cannot compute beta density at 0 when alpha = {0,number}"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_FORMAT_OBJECT_TO_FRACTION("cannot compute beta density at 1 when beta = %.3g"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("cannot compute nth root for null or negative n: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("cannot discard a negative number of elements ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_FORMAT_OBJECT_TO_FRACTION("cannot format a {0} instance as a 3D vector"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("cannot format a {0} instance as a complex number"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("cannot format a {0} instance as a real vector"),
    /* JADX INFO: Fake field, exist only in values array */
    CANNOT_FORMAT_OBJECT_TO_FRACTION("cannot format given object as a fraction number"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("statistics constructed from external moments cannot be incremented"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("cannot normalize a zero norm vector"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("elements cannot be retrieved from a negative array index {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("cannot set an element at a negative index {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("cannot substitute an element from an empty array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("Conversion Exception in Transformation: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Cardan angles singularity"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("class ({0}) does not implement Comparable"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("too close vertices near point ({0}, {1}, {2})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("the closest orthogonal matrix has a negative determinant {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("column index {0} out of allowed range [{1}, {2}]"),
    COLUMN_INDEX("column index ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("constraint"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("Continued fraction convergents diverged to +/- infinity for value {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Continued fraction diverged to NaN for value {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("contraction criteria ({0}) smaller than the expansion factor ({1}).  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction."),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("contraction criteria smaller than one ({0}).  This would lead to a never ending loop of expansion and contraction as an internal storage array length equal to the number of elements would satisfy the contraction criteria."),
    CONVERGENCE_FAILED("convergence failed"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("some outline boundary loops cross each other"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("crossover rate ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Cumulative probability function returned NaN for argument {0} p = {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("some rows have length {0} while others have length {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("original and permuted data must contain the same elements"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("digest not initialized"),
    DIMENSIONS_MISMATCH_2x2("got {0}x{1} but expected {2}x{3}"),
    DIMENSIONS_MISMATCH_SIMPLE("{0} != {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("dimensions mismatch"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("Discrete cumulative probability function returned NaN for argument {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("distribution not loaded"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("duplicated abscissa {0} causes division by zero"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("edge joining points ({0}, {1}, {2}) and ({3}, {4}, {5}) is connected to one facet only"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("elitism rate ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("empty cluster in k-means"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("sample for interpolation is empty"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("empty polynomials coefficients array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("empty selected column index array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("empty selected row index array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("empty string for imaginary character"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("endpoints do not specify an interval: [{0}, {1}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("equal vertices {0} and {1} in simplex configuration"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Euler angles singularity"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("evaluation"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("expansion factor smaller than one ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("facets orientation mismatch around edge joining points ({0}, {1}, {2}) and ({3}, {4}, {5})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("must have n >= 0 for n!, got n = {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("number of iterations={4}, maximum iterations={5}, initial={6}, lower bound={7}, upper bound={8}, final a value={0}, final b value={1}, f(a)={2}, f(b)={3}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Unable to convert {0} to fraction after {1} iterations"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("first {0} columns are not initialized yet"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("first element is not 0: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("first {0} rows are not initialized yet"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Overflow trying to convert {0} to fraction ({1}/{2})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("function is not differentiable"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("function is not polynomial"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("overflow: gcd({0}, {1}) is 2^31"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("overflow: gcd({0}, {1}) is 2^63"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("{0} wide hole between models time ranges"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("condition number {1} is too high "),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("inconsistent state at 2π wrapping"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("the index specified: {0} is larger than the current maximal index {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("index ({0}) is not positive"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("index {0} out of allowed range [{1}, {2}]"),
    INDEX("index ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0} is not a finite number"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("interval bounds must be finite"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("value {0} at index {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("Array contains an infinite element, {0} at index {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("cannot convert infinite value"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("initial capacity ({0}) is not positive"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("initial column {1} after final column {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("initial row {1} after final row {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("input data comes from unsupported datasource: {0}, supported sources: {1}, {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("instance of class {0} not comparable to existing values"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("insufficient data"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("insufficient data for t statistic, needs at least 2, got {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("insufficient dimension {0}, must be at least {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("dimension ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("sample contains {0} observed points, at least {1} are required"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("insufficient data: only {0} rows and {1} columns."),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("multistep method needs at least {0} previous steps, got {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("internal error, please fill a bug report at {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("invalid binary digit: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("binary mutation works on BinaryChromosome only"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("invalid bracketing parameters:  lower bound={0},  initial={1}, upper bound={2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("one-point crossover only works with fixed-length chromosomes"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("required functionality is missing in {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("invalid interval, initial value parameters:  lower={0}, initial={1}, upper={2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("invalid iteration limits: min={0}, max={1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("bad value for maximum iterations number: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("the number of observations is not sufficient to conduct regression"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("input data array length = {0} does not match the number of observations = {1} and the number of regressors = {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("length of regressor array = {0} does not match the number of variables = {1} in the model"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("invalid rounding method {0}, valid methods: {1} ({2}), {3} ({4}), {5} ({6}), {7} ({8}), {9} ({10}), {11} ({12}), {13} ({14}), {15} ({16})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("iterator exhausted"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("iterations"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("overflow: lcm({0}, {1}) is 2^31"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("overflow: lcm({0}, {1}) is 2^63"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("list of chromosomes bigger than maxPopulationSize"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("Loess expects at least 1 point"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("lower bound ({0}) must be strictly less than upper bound ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("lower endpoint ({0}) must be less than or equal to upper endpoint ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("map has been modified while iterating"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("multistep integrator starter stopped early, maybe too large step size"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("evaluations"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("maximal count ({0}) exceeded"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("maximal number of iterations ({0}) exceeded"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("minimal step size ({1,number,0.00E00}) reached, integration needs {0,number,0.00E00}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Loess expects the abscissa and ordinate arrays to be of the same size, but got {0} abscissae and {1} ordinatae"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("mutation rate ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("element {0} is NaN"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("cannot convert NaN value"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("brightness exponent should be positive or null, but got {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("negative complex module {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("element ({0}, {1}) is negative: {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("element {0} is negative: {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("number of successes must be non-negative ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("number of successes ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("number of trials must be non-negative ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("number of interpolation points ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("number of trials ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("vertices do not form a convex hull in CCW winding"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("hyperplanes do not define a convex region"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("number of robustness iterations ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("start position ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("Continued fraction convergents failed to converge (in less than {0} iterations) for value {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("non-invertible affine transform collapses some lines into single points"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("number of microsphere elements must be positive, but got {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("polynomial degree must be positive: degree={0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("all abscissae must be finite real numbers, but {0}-th is {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("all ordinatae must be finite real numbers, but {0}-th is {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("all weights must be finite real numbers, but {0}-th is {1}"),
    NON_SQUARE_MATRIX("non square ({0}x{1}) matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("Norm ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Cannot normalize to an infinite value"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("Cannot normalize to NaN"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0}x{1} and {2}x{3} matrices are not addition compatible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("points {0} and {1} are not decreasing ({2} < {3})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("points {3} and {2} are not decreasing ({1} < {0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("not enough data ({0} rows) for this many predictors ({1} predictors)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("spline partition must have at least {0} points, got {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("points {0} and {1} are not increasing ({2} > {3})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("points {3} and {2} are not increasing ({1} > {0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("{0}x{1} and {2}x{3} matrices are not multiplication compatible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("not positive definite matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("not positive definite matrix: diagonal element at ({1},{1}) is smaller than {2} ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("non positive definite linear operator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("non self-adjoint linear operator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("non square ({0}x{1}) linear operator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("degrees of freedom ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("degrees of freedom must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("element {0} is not positive: {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("invalid exponent {0} (must be positive)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("number of elements should be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("base ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("exponent ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("length must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("length ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("mean must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("mean ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("number of sample is not positive: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("number of samples ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("permutation k ({0}) must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("permutation size ({0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("the Poisson mean must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("population size must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("population size ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("invalid row dimension: {0} (must be positive)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("sample size must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("scale must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("scale ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("shape must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("shape ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("standard deviation must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("standard deviation ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("upper bound must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("window size must be positive ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("{0} is not a power of 2"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0} is not a power of 2, consider padding for fix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("{0} is not a power of 2 plus one"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("points {0} and {1} are not strictly decreasing ({2} <= {3})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("points {3} and {2} are not strictly decreasing ({1} <= {0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("knot values must be strictly increasing"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("points {0} and {1} are not strictly increasing ({2} >= {3})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("points {3} and {2} are not strictly increasing ({1} >= {0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("{0}x{1} and {2}x{3} matrices are not subtraction compatible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("method not supported in dimension {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("not symmetric matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("non symmetric matrix: the difference between entries at ({0},{1}) and ({1},{0}) is larger than {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("no bin selected"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("none of the {0} start points lead to convergence"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("no data"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("no degrees of freedom ({0} measurements, {1} parameters)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("This distribution does not have a density function implemented"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("no feasible solution"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("no optimum computed yet"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("Regression model must include at least one regressor"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("no result available"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("no entry at indices ({0}, {1}) in a {2}x{3} matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("NaN is not allowed"),
    NULL_NOT_ALLOWED("null is not allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("a null or zero length array not allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("covariance matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("denominator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("denominator format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("fraction"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("function"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("imaginary format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("input array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("numerator"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("numerator format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("conversion exception in transformation"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("real format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("whole format"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0} is larger than the maximum ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("{0} is smaller than the minimum ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0} is larger than, or equal to, the maximum ({1})"),
    NUMBER_TOO_SMALL_BOUND_EXCLUDED("{0} is smaller than, or equal to, the minimum ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("number of successes ({0}) must be less than or equal to population size ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("overflow, numerator too large after multiply: {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0} points Legendre-Gauss integrator not supported, number of points must be in the {1}-{2} range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("observed counts are all 0 in observed array {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("observed counts are both zero for entry {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("the difference between the upper and lower bound must be larger than twice the initial trust region radius ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("out of bounds quantile value: {0}, must be in (0, 100]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("out of bounds confidence level {0}, must be between {1} and {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("out of bounds significance level {0}, must be between {1} and {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("significance level ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("the abscissae array must be sorted in a strictly increasing order, but the {0}-th element is {1} whereas {2}-th is {3}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("point ({0}, {1}, {2}) is out of plane"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("out of range root of unity index {0} (must be in [{1};{2}])"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("out of range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0} out of [{1}, {2}] range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("{0} out of ({1}, {2}] range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0} out of [{1}, {2}) range"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("an outline boundary loop is open"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("overflow"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("overflow in fraction {0}/{1}, cannot negate"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("overflow in addition: {0} + {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("overflow in subtraction: {0} - {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("overflow in multiplication: {0} * {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("cannot access {0} method in percentile implementation {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("percentile implementation {0} does not support {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("permutation size ({0}) exceeds permuation domain ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("polynomial"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("number of polynomial interpolants must match the number of segments ({0} != {1} - 1)"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("population limit has to be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("cannot raise an integral value to a negative power ({0}^{1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("propagation direction mismatch"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("RandomKeyMutation works only with RandomKeys, not {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("roots of unity have not been computed yet"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("a {0}x{1} matrix cannot be a rotation matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("row index {0} out of allowed range [{1}, {2}]"),
    ROW_INDEX("row index ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("function values at endpoints do not have different signs, endpoints: [{0}, {1}], values: [{2}, {3}]"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("sample size ({0}) exceeds collection size ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("sample size ({0}) must be less than or equal to population size ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("simplex must contain at least one point"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("matrix is singular"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("operator is singular"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("subarray ends after array end"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("cutoff singular value is {0}, should be at most {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("tournament arity ({0}) cannot be bigger than population size ({1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("cannot discard {0} elements from a {1} elements array"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("too many regressors ({0}) specified, only {1} in the model"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("cost relative tolerance is too small ({0}), no further reduction in the sum of squares is possible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("too small integration interval: length = {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("orthogonality tolerance is too small ({0}), solution is orthogonal to the jacobian"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("parameters relative tolerance is too small ({0}), no further improvement in the approximate solution is possible"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("trust region step has failed to reduce Q"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("two or more categories required, got {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("two or more values required in each category, one has {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("unable to bracket optimum in line search"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("unable to compute covariances: singular problem"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("unable to first guess the harmonic coefficients"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("unable to orthogonalize matrix in {0} iterations"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("unable to perform Q.R decomposition on the {0}x{1} jacobian matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("unable to solve: singular problem"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("unbounded solution"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("unknown mode {0}, known modes: {1} ({2}), {3} ({4}), {5} ({6}), {7} ({8}), {9} ({10}) and {11} ({12})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("unknown parameter {0}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("ode does not match the main ode set in the extended set"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("string \"{0}\" unparseable (from position {1}) as an object of type {2}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("string \"{0}\" unparseable (from position {1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("unparseable 3D vector: \"{0}\""),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("unparseable complex number: \"{0}\""),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("unparseable real vector: \"{0}\""),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("unsupported expansion mode {0}, supported modes are {1} ({2}) and {3} ({4})"),
    UNSUPPORTED_OPERATION("unsupported operation"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("arithmetic exception"),
    ILLEGAL_STATE("illegal state"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("exception generated in user code"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("URL {0} contains no data"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("{0} values have been added before statistic is configured"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("vector length mismatch: got {0} but expected {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("vector must have at least one element"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("weigth array must contain at least one non-zero value"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("wrong array shape (block length = {0}, expected {1})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("{0} points are required, got only {1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("number of points ({0})"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("denominator must be different from 0"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_DENOMINATOR_IN_FRACTION("zero denominator in fraction {0}/{1}"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_FRACTION_TO_DIVIDE_BY("the fraction to divide by must not be zero: {0}/{1}"),
    ZERO_NORM("zero norm"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_AXIS("zero norm for rotation axis"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("zero norm for rotation defining vector"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO_NOT_ALLOWED("zero not allowed here");


    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f113911OooOo0o;

    EnumC31935OooO0Oo(String str) {
        this.f113911OooOo0o = str;
    }

    @Override // oO000O0.OooO0OO
    public final String OooOooo(Locale locale) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("assets/" + EnumC31935OooO0Oo.class.getName().replaceAll("\\.", "/"), locale);
            if (bundle.getLocale().getLanguage().equals(locale.getLanguage())) {
                return bundle.getString(toString());
            }
        } catch (MissingResourceException unused) {
        }
        return this.f113911OooOo0o;
    }
}
