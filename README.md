### BottomSheetDialogFragment Demo

A simple android demo that demonstrates BottomsheetDialogFragment using kotlin

### Demo

<img src="https://user-images.githubusercontent.com/10658016/71091656-82842f00-21cb-11ea-9085-f58517692780.gif?raw=true" alt="Home Page" width="300"/>
</p>

### Code Setup

```
  implementation 'com.google.android.material:material:1.2.0-alpha02'
```
Fragment Layout

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="15dp">

    <TextView
        android:id="@+id/tvFirst"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:drawableLeft="@drawable/my_profile_two"
        android:drawablePadding="10dp"
        android:padding="10dp"
        android:text="My Profile" />

    <TextView
        android:id="@+id/tvSecondView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:drawableLeft="@drawable/history_icon"
        android:drawablePadding="10dp"
        android:padding="10dp"
        android:text="My Orders" />


    <TextView
        android:id="@+id/tvThirdView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:drawableLeft="@drawable/add_address"
        android:drawablePadding="10dp"
        android:padding="10dp"
        android:text="Add address" />

    <TextView
        android:id="@+id/tvFourthView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:drawableLeft="@drawable/share"
        android:drawablePadding="10dp"
        android:padding="10dp"
        android:text="Share app" />

    <TextView
        android:id="@+id/tvFifthView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:drawableLeft="@drawable/logout"
        android:drawablePadding="10dp"
        android:padding="10dp"
        android:text="Logout" />

</LinearLayout>
```

Fragment code

```
class BottomSheetDialog : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view: View = inflater.inflate(R.layout.bottom_menu, container)

        view.findViewById<TextView>(R.id.tvFirst).setOnClickListener {
            dialog!!.dismiss()
            Toast.makeText(activity, "Clicked", Toast.LENGTH_LONG).show()
        }
        return view
    }
}
```

Show Dialog Like this

```
BottomSheetDialog().show(supportFragmentManager, "MainActivity")

```
