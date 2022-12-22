# capacitor-plugin-android-tiktok-events

**Important note**: this plugin is not generic! It is just a temporary workaround that hardcodes lots of stuff.

## Install

```bash
npm install capacitor-plugin-android-tiktok-events
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`prepare()`](#prepare)
* [`logEvent(...)`](#logevent)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### prepare()

```typescript
prepare() => Promise<any>
```

**Returns:** <code>Promise&lt;any&gt;</code>

--------------------


### logEvent(...)

```typescript
logEvent(options: { event: string; }) => Promise<any>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ event: string; }</code> |

**Returns:** <code>Promise&lt;any&gt;</code>

--------------------

</docgen-api>
