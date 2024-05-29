<template lang="">
    <div>
        HOLA RUTA NUEVA
        {{ data }}
    </div>
</template>
<script>
 import axios from 'axios'

export default {
    data() {
        return {
            data: null
        }
    },
    methods: {
        async getData() {
            const response = await axios.get('http://localhost:8080/api/hello')
            .then (response => {
                this.data = response.data.message
            })
            .catch(error => {
                console.log(error)
            })


        }
        
    },
    mounted() {
        this.getData();
    }
}
</script>
<style lang="">
    
</style>
