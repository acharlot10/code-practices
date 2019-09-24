<template>
    <h1> {{msg}} {{ amount }} turtles</h1>
</template>

<script>
export default {
    name: 'Turtles',
    props: {
        msg: String,
        amount: Number
    }

}
</script>

