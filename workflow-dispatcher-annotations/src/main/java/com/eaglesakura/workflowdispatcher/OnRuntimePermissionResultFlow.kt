package com.eaglesakura.workflowdispatcher

/**
 *  Annotation to startActivityForResult:onActivityResult flow.
 *
 *  e.g.)
 *  class ExampleFlow : Fragment() {
 *      fun startFlow() {
 *          exampleRuntimePermissionFlow() // call generated entry-point.
 *      }
 *
 *      @UiThread
 *      @OnRuntimePermissionResultFlow("exampleRuntimePermissionFlow")
 *      fun onExampleRuntimePermissionFlowResult(permissions: List<String>, grantResults: List<Int>, savedFlowState: Bundle?) {
 *          // do something
 *      }
 *  }
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.BINARY)
annotation class OnRuntimePermissionResultFlow(
    /**
     *  Generate entry-point function name.
     */
    val entryPointName: String,

    /**
     *  Request runtime permissions.
     *  e.g. android.Manifest.permission.WRITE_EXTERNAL_STORAGE
     */
    val permissions: Array<String>
)
